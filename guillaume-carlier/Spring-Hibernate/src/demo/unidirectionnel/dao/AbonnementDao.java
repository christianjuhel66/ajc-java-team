package demo.unidirectionnel.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import demo.unidirectionnel.entity.Abonnement;

public class AbonnementDao implements AbonnementDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void create(Abonnement abonnement) {
		Session session = sessionFactory.getCurrentSession();
		session.save(abonnement);
	}

	@Override
	@Transactional
	public void update(Abonnement abonnement) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(abonnement);
	}
}
