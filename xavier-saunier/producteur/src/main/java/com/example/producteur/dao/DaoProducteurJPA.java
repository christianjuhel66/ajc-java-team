package com.example.producteur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.producteur.entity.Producteur;

@Repository
public class DaoProducteurJPA implements DaoInterface {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Producteur> findAll() {
	TypedQuery<Producteur> typedQuery = entityManager.createQuery("from Producteur", Producteur.class);
	return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public Producteur findById(int id) {
	entityManager.find(Producteur.class, id);
	return entityManager.find(Producteur.class, id);
    }

    @Override
    @Transactional
    public int save(Producteur producteur) {
	Producteur storedProducteur = entityManager.merge(producteur);
	return Math.toIntExact((long) storedProducteur.getId());
    }
    // java cannot cast from long to int ? aucun long pourtant

    @Override
    @Transactional
    public void deleteById(int id) {
	Query query = entityManager.createQuery("delete from Producteur where id=:roducteurId");
	query.setParameter("producteurId", id);

	query.executeUpdate();

    }

}
