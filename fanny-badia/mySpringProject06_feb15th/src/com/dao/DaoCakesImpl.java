package com.dao;

import com.entities.Cakes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class DaoCakesImpl implements DaoCakes {
    //injection de dépendance: (= injection de la DAO dans Session Factory, via le getBean qui recupere le DAO crée)
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    // méthode pour récupérer tous les "cakes" crées et stockés ds une Liste:
    public List<Cakes> findAll(){
        Session session = sessionFactory.getCurrentSession();
        List<Cakes> cakes = session.createQuery("from Cakes", Cakes.class).getResultList();
        return cakes;
    }


    @Override
    @Transactional
    public int create(Cakes cakes){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cakes);
        return cakes.getId();
    }

    @Override
    @Transactional
    public Cakes getOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        Cakes target = session.get(Cakes.class, id);
        return target;
    }

    @SuppressWarnings("deprecation")
    @Override
    @Transactional
    public List<Cakes> getByCakeName(String cakeName) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Cakes cakes where cakes.cakeName= :param ", Cakes.class);
        query.setParameter("param", cakeName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Cakes where id=:unId");
        query.setParameter("unId", id);
        query.executeUpdate();
    }

    @Override
    @Transactional
    public void delete(Cakes cakes) {
        // deleteById(cakes.getId());
        Session session = sessionFactory.getCurrentSession();
        session.delete(cakes);      // pour supprimer le cake ET sa recipe
    }
}
