package com.demo.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entities.Artisan;
import com.demo.entities.Plaquiste;
import com.demo.entities.Plombier;

public class MonApp {

	public static void main(String[] args) {
		// charger context spring avec le fichier xml de configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// récupérer un Artisan Plombier depuis le contexte
		Artisan art1 = context.getBean("plombier", Artisan.class);
		// utiliser mon objet
		System.out.println(art1.redigerDevis());
		// utiliser la dépendance dans mon objet
		System.out.println(art1.decoupage());
		Plombier plomb = new Plombier();

		// récupérer un Artisan Plaquiste depuis le contexte
		Artisan art2 = context.getBean("plaquiste", Artisan.class);
		// utiliser mon objet
		System.out.println(art2.redigerDevis());
		// utiliser la dépendance dans mon objet
		System.out.println(art2.decoupage());
		Plaquiste plaq = new Plaquiste();

		// fermer le contexte
		context.close();
	}

}
