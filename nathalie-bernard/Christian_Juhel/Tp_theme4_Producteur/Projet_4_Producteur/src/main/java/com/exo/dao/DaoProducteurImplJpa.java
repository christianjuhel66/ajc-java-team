package com.exo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exo.entities.Producteur;

@Repository//Injection de la classe dans le repository 
@Primary// Pour que ce Dao soit choisit en priorité
public class DaoProducteurImplJpa implements DaoProducteurInterface {

	@Autowired//Injection de EntityManager
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
		em.find(Producteur.class, id);
		return em.find(Producteur.class, id);
	}

	@Override
	@Transactional
	public Long save(Producteur producteur) {
		Producteur storedProducteur = em.merge(producteur);
		return storedProducteur.getId();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		System.out.println("--- dao :  producteur to delete id = " + id);
		Query query = em.createQuery("delete  from Producteur where id=:producteurId");
		query.setParameter("producteurId", id);
		query.executeUpdate();

	}

}
