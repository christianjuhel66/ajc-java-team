package demo.unidirectionnel.execution;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.unidirectionnel.dao.UtilisateurDao;
import demo.unidirectionnel.entity.Abonnement;
import demo.unidirectionnel.entity.Utilisateur;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("test");

		Abonnement a = new Abonnement();
		a.setType("Premium");

		UtilisateurDao dao = context.getBean("utilisateurDaoImpl", UtilisateurDao.class);

		Utilisateur u = new Utilisateur("Guy", "Georges", null);
		dao.create(u);

		List<Utilisateur> users = dao.getAllUsers();

		for (Utilisateur utilisateur : users) {
			System.out.println(utilisateur.getNom() + " - " + utilisateur.getPrenom());
		}
	}
}
