package com.ecole.stagiaires.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecole.stagiaires.entities.Stagiaire;

@Repository
public class DaoImpl implements Dao{
	
	@Autowired
	private EntityManager em;

	@Override
	@Transactional
	public List<Stagiaire> findAll() {
	    // get the current hibernate session
		Session session = em.unwrap(Session.class);
		// session.beginTransaction();
		Query <Stagiaire> query = session.createQuery("from Stagiaire",Stagiaire.class);
		// session.getTransaction().commit();
		List <Stagiaire> stagiaires = query.getResultList();
		return stagiaires;
	}

	@Override
	@Transactional
	public void create(Stagiaire stagiaire) {
		Session session = em.unwrap(Session.class);
		session.save(stagiaire);
	}
	
	@Override
	@Transactional
	public Stagiaire read(int id) {
		Session session = em.unwrap(Session.class);
		return session.get(Stagiaire.class, id);
	}
	
	@Override
	@Transactional
	public void updateAdresse(int id,String adresse) {
		Session session = em.unwrap(Session.class);
		Stagiaire stagiaire = session.get(Stagiaire.class, id);
		stagiaire.setAdresse(adresse);
		session.update(stagiaire);
	}
	
	@Override	
	@Transactional
	public void delete(int id) {
		Session session = em.unwrap(Session.class);
		String queryString = "delete from Stagiaire where id=:stagiaireId"; 
		Query query = session.createQuery(queryString); 
		query.setParameter("stagiaireId", id);
		query.executeUpdate();
		System.out.println("User: " + id + " deleted.");
	}
}
