package com.exo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exo.entities.Produit;

@Repository//Injection de la classe dans le repository 
@Primary// Pour que ce Dao soit choisit en priorité
public class DaoProduitImplJpa implements DaoProduitInterface{

	@Autowired//Injection de EntityManager
	private EntityManager em;

	@Override
	@Transactional
	public List<Produit> findAll() {
		TypedQuery<Produit> typedQuery = em.createQuery("from Produit", Produit.class);
		return typedQuery.getResultList();
	}

	@Override
	@Transactional
	public Produit findById(Long id) {
		em.find(Produit.class, id);
		return em.find(Produit.class, id);
	}

	@Override
	@Transactional
	public Long save(Produit produit) {
		Produit storedProduit = em.merge(produit);
		return storedProduit.getId();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		System.out.println("--- dao :  produit to delete id = " + id);
		Query query = em.createQuery("delete  from Produit where id=:produitId");
		query.setParameter("produitId", id);
		query.executeUpdate();

	}

}
