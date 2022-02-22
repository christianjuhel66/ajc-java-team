package com.ajc;

import com.ajc.dao.Dao;
import com.ajc.entities.Fruit;
import com.ajc.entities.Legume;
import com.ajc.entities.Panier;
import com.ajc.services.FruitServiceImpl;
import com.ajc.services.FruitServiceInterface;
import com.ajc.services.LegumeServiceInterface;
import com.ajc.services.PanierServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/*
Création d'une application de gestion de panier de légumes et de fruits
J'expose trois services (pour l'instant)
http://localhost:8080/panier/1 (prend un argument l'id du panier et retourne le panier entier)
http://localhost:8080/panier/listLegumes (retourne la liste des légumes)
http://localhost:8080/panier/listFruits (retourne la liste des fruits)
 */
@SpringBootApplication
public class DemoRestControllerApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoRestControllerApplication.class, args);
	}

	@Autowired
	private FruitServiceInterface repoFruit;

	@Autowired
	private LegumeServiceInterface repoLegume;

	@Autowired
	private PanierServiceInterface repoPanier;

	@Override
	public void run(String... args) throws Exception {
		//Sauvegarder des fruits dans la BDD
		Fruit fruit1 = new Fruit("Pomme","Cavendish",1.4,"Juteuses");
		Fruit fruit2 = new Fruit("Orange","Valencia Late",2.5,"Bien juteuses, idéales pour jus de fruit");
		repoFruit.save(fruit1);
		repoFruit.save(fruit2);
		repoFruit.save(new Fruit("Banane","Plantain",1.6,"Idéal pour cocktail maison"));
		repoFruit.save(new Fruit("Raisin","Dattier de Beyrouth",3.5,""));
		repoFruit.findAll();

		Legume legume1 = new Legume("Pomme de terre","Dalida",2.0,"Idéales pour frites");
		repoLegume.save(legume1);
		repoLegume.save(new Legume("Haricots","Tarbais ",2.0,"Parfait pour cassoulet"));
		repoLegume.findAll();

		List<Fruit> fruits = new ArrayList();
		fruits.add(fruit1);
		fruits.add(fruit2);

		List<Legume> legumes = new ArrayList();
		legumes.add(legume1);

		Panier panier = new Panier(fruits,legumes,"3.5");
		Long id = repoPanier.save(panier);
		System.out.println(id);
		Panier recupPanier = repoPanier.findById(id);
		System.out.println(recupPanier.toString());

	}
}
