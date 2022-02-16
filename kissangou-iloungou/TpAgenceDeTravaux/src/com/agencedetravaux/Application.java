package com.agencedetravaux;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agencedetravaux.entities.Artisans;

public class Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Artisans carreleur = context.getBean("carreleur", Artisans.class);
		carreleur.faireUnDevis();
		System.out.println(carreleur.getDecoupage() + "\n");

		Artisans charpentier = context.getBean("charpentier", Artisans.class);
		charpentier.faireUnDevis();
		System.out.println(charpentier.getDecoupage() + "\n");

		Artisans electricien = context.getBean("electricien", Artisans.class);
		electricien.faireUnDevis();
		System.out.println(electricien.getDecoupage() + "\n");

		context.close();

	}

}