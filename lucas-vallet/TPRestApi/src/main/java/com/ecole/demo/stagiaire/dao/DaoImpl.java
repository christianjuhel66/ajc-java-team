package com.ecole.demo.stagiaire.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecole.demo.stagiaire.entity.Employe;
import com.ecole.demo.stagiaire.entity.Entreprise;
import com.ecole.demo.stagiaire.entity.Stagiaire;

@Component
public class DaoImpl implements Dao{
	@Autowired
    private EntityManager em;

	@Override
	@Transactional
	public List<Stagiaire> findAllStagiaire() {
		TypedQuery<Stagiaire> typedQuery = em.createQuery("from Stagiaire", Stagiaire.class);
        return typedQuery.getResultList();
	}

	@Override
	@Transactional
	public List<Employe> findAllEmploye() {
		TypedQuery<Employe> typedQuery = em.createQuery("from Employe", Employe.class);
        return typedQuery.getResultList();
	}

	@Override
	@Transactional
	public Entreprise findEntreprise(int id) {
		 return em.find(Entreprise.class, id);
	}

	@Override
	@Transactional
	public int save(Stagiaire s) {
		Stagiaire stagiaireSaved = em.merge(s);
        return stagiaireSaved.getId();
	}

	@Override
	@Transactional
	public int save(Employe e) {
		Employe employeSaved = em.merge(e);
        return employeSaved.getId();
	}

	@Override
	@Transactional
	public int save(Entreprise e) {
		Entreprise entrepriseSaved = em.merge(e);
        return entrepriseSaved.getId();
	}

	@Override
	@Transactional
	public int removeEmploye(int id) {
		em.createQuery("delete from Employe e where e.id=:id")
		.setParameter("id", id)
		.executeUpdate();
		return 0;
	}

}
