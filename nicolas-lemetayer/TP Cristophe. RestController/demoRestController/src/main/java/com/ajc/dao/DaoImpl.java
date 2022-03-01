package com.ajc.dao;

import com.ajc.entities.Fruit;
import com.ajc.entities.Legume;
import com.ajc.entities.Panier;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class DaoImpl implements Dao {
    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public List<Fruit> findAll() {
        TypedQuery<Fruit> typedQuery = em.createQuery("from Fruit", Fruit.class);
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public Long save(Fruit fruit) {
        Fruit storedFruit = em.merge(fruit);
        return storedFruit.getId();
    }

    @Override
    @Transactional
    public void delete(Fruit fruit) {
        Fruit fruitDelete = em.find(Fruit.class, fruit.getId());
        em.remove(fruitDelete);
    }

    @Override
    @Transactional
    public List<Legume> FindAllLegumes() {
        TypedQuery<Legume> typedQuery = em.createQuery("from Legume", Legume.class);
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public Long saveLegume(Legume legume) {
        Legume storedLegume = em.merge(legume);
        return storedLegume.getId();
    }

    @Override
    public void delete(Legume legume) {
        Legume legumeDelete = em.find(Legume.class, legume.getId());
        em.remove(legumeDelete);
    }

    @Override
    @Transactional
    public Panier findPanier(Long id) {
        return em.find(Panier.class, id);
    }

    @Override
    @Transactional
    public Long savePanier(Panier panier) {
        Panier storedPanier= em.merge(panier);
        return storedPanier.getId();
    }
}
