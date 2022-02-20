package com.demo.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Artisan artisan = new Artisan("David", "Yang", "Rue de montreuil", 24);
		 * Artisan architecte = new Architecte("David", "Yang", "Rue de montreuil", 24,
		 * true); Charpentier c = new Charpentier(); architecte.devis();
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Architecte architecte = context.getBean("architecteA", Architecte.class);
		System.out.println(architecte.getDevis());

		Charpentier charpentierA = context.getBean("charpentierA", Charpentier.class);
		System.out.println(charpentierA.getDevis());
		System.out.println(charpentierA.getDecoupe());

		Charpentier charpentierB = context.getBean("charpentierB", Charpentier.class);
		System.out.println(charpentierB.getDevis());
		System.out.println(charpentierB.getDecoupe());

		boolean result = charpentierA == charpentierB;
		System.out.println("\nPointing to the same object: " + result);
		context.close();
	}

}
