package com.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.entity.Cours;

@Component
@Transactional
public class DaoCoursImplJPA implements DaoInterface {

	@Autowired
	private EntityManager em;

	@Override
	@Transactional
	public List<Cours> findAll() {
		TypedQuery<Cours> typedQuery = em.createQuery("from Cours", Cours.class);
		return typedQuery.getResultList();
	}

	@Override
	@Transactional
	public Cours findById(int id) {
		em.find(Cours.class, id);
		return em.find(Cours.class, id);
	}

	@Override
	@Transactional
	public int save(Cours cours) {
		Cours storedCours = em.merge(cours);
		return storedCours.getId();
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		System.out.println("--- dao :  cours to delete id = " + id);
		Query query = em.createQuery("delete from Cours where id=:coursId");
		query.setParameter("coursId", id);

		query.executeUpdate();

	}

}
