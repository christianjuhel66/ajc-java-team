package com.artisan.exec;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.artisan.entity.Artisan;

public class App {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Artisan sculpteur = context.getBean("sculpteur", Artisan.class);
		sculpteur.getOutils();
		sculpteur.getDevis();
		sculpteur.getTailler();
		
		System.out.println("-----------------------------------------");
		
		
		Artisan ebeniste = context.getBean("ebeniste", Artisan.class);
		ebeniste.getOutils();
		ebeniste.getDevis();
		ebeniste.getTailler();
		
		context.close();

	}

}
