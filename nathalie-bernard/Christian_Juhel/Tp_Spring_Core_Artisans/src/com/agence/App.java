package com.agence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agence.entities.Artisan;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Artisan carreleur = context.getBean("carreleur", Artisan.class);
		carreleur.faireUnDevis();
		System.out.println(carreleur.getDecoupage() + "\n");

		Artisan macon = context.getBean("macon", Artisan.class);
		macon.faireUnDevis();
		System.out.println(macon.getDecoupage() + "\n");

		Artisan ebeniste = context.getBean("ebeniste", Artisan.class);
		ebeniste.faireUnDevis();
		System.out.println(ebeniste.getDecoupage() + "\n");

		context.close();

	}

}
