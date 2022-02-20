package com.projet.projetrestaurant.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projet.projetrestaurant.entities.Employes;
import com.projet.projetrestaurant.entities.Gerant;

@Repository // ou @Component // instancier DaoRestaurantImpl dans le contexte
public class DaoRestaurantImpl implements DaoInterface {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employes> findAll() {

		// Step 1: injection de la SessionFactory par Spring
		Session session = entityManager.unwrap(Session.class);

		// Step 2: création de la requête
		Query<Employes> query = session.createQuery("from Employes", Employes.class);
		return query.getResultList();
	}

	// Step 3: rajout de la méthode create dans l'implémentation
	@Override
	public void create(Gerant gerant) {
		Session session = entityManager.unwrap(Session.class);
		session.save(gerant);
	}

	@Override
	public void create(Employes employes) {
		Session session = entityManager.unwrap(Session.class);
		session.save(employes);

	}

}
