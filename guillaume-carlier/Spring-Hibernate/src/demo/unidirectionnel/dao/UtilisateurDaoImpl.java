package demo.unidirectionnel.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import demo.unidirectionnel.entity.Utilisateur;

@Component
public class UtilisateurDaoImpl implements UtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void create(Utilisateur utilisateur) {
		Session session = sessionFactory.getCurrentSession();
		session.save(utilisateur);
	}

	@Override
	@Transactional
	public void update(Utilisateur utilisateur) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(utilisateur);
	}

	@Override
	@Transactional
	public Utilisateur getUserById(Long id) {

		Session session = sessionFactory.getCurrentSession();
		Utilisateur user = session.get(Utilisateur.class, id);
		return user;
	}

	@Override
	@Transactional
	public List<Utilisateur> getAllUsers() {

		Session session = sessionFactory.getCurrentSession();
		List<Utilisateur> users = session.createQuery("from Utilisateur", Utilisateur.class).getResultList();
		return users;
	}
}
