package com.github.inposa.mini_projet_restaurant.dao;

import com.github.inposa.mini_projet_restaurant.entities.Restaurant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class DAORestaurant implements DAO {

    @Autowired
    private EntityManager em;

    public EntityManager getEntityManager() {
        return em;
    }

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public List<Restaurant> findAll() {
        List<Restaurant> restaurants = em.createQuery("FROM Restaurant", Restaurant.class).getResultList();
        return restaurants;
        /*
        Session session = sessionFactory.getCurrentSession();
        List<Restaurant> restaurants = session.createQuery("FROM Restaurant", Restaurant.class).getResultList();
        return restaurants;*/
    }

    @Override
    @Transactional
    public Restaurant findById(int id) {
        Session session = em.unwrap(Session.class);
        Restaurant restaurant = session.get(Restaurant.class, id);
        return restaurant;
    }
}
