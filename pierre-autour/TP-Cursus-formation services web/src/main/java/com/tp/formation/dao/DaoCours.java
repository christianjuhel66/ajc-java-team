package com.tp.formation.dao;

import com.tp.formation.entity.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class DaoCours implements DaoInterface {

    @Autowired
    private EntityManager em;

    @Override
    public List<Cours> findAll() {
        TypedQuery<Cours> typedQuery = em.createQuery("FROM Cours", Cours.class);
        return typedQuery.getResultList();
    }

    @Override
    public Cours findById(int id) {
        em.find(Cours.class, id);
        return em.find(Cours.class, id);
    }

    @Override
    public int save(Cours cours) {
        Cours storedCours = em.merge(cours);
        return storedCours.getId();
    }

    @Override
    public void deleteById(int id) {
        Query query = em.createQuery("DELETE FROM Cours where id = :coursId");
        query.setParameter("coursId", id).executeUpdate();
    }
}
