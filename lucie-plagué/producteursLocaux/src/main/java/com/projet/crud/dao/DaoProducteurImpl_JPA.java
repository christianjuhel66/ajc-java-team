package com.projet.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.projet.crud.Entity.Producteur;

@Repository // injection de la classe dans le repo pour utilisation
@Primary // Priorité d'utilisation de la classe
public class DaoProducteurImpl_JPA implements DaoInterface {

	@Autowired // Injection de la classe EntityManager
	private EntityManager em;

	@Override
	@Transactional
	public List<Producteur> findAll() {
		TypedQuery<Producteur> typedQuery = em.createQuery("from Producteur", Producteur.class);
		return typedQuery.getResultList();
	}

	@Override
	@Transactional
	public Producteur findById(Long id) {
		return em.find(Producteur.class, id);
	}

	@Override
	@Transactional
	public Long save(Producteur producteur) { // création d'un producteur
		Producteur storedProducteur = em.merge(producteur);
		return storedProducteur.getId();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		Query query = em.createQuery("delete from Producteur where id=:producteurId");
		query.setParameter("producteurId", id);
		query.executeUpdate();

	}

}
