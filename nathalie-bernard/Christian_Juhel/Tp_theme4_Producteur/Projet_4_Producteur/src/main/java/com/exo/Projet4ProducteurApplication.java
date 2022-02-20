package com.exo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exo.dao.DaoProducteurInterface;
import com.exo.dao.DaoProduitInterface;
import com.exo.entities.Producteur;
import com.exo.entities.Produit;

@SpringBootApplication
public class Projet4ProducteurApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Projet4ProducteurApplication.class, args);
	}
	
	@Autowired//Injection de la dao
	private DaoProducteurInterface repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Créer les producteurs
		Producteur P1 = new Producteur("Flora", "Carre", "0675342723", "Houilles", 48.9229416, 2.1868998,"vins");
		Producteur P2 = new Producteur("Romane", "Debernard", "0677948723", "Sartrouville",48.9409016, 2.1585037, "fromages");
		Producteur P3 = new Producteur("Mathieu", "Dejesus", "0679340023", "Bezons", 48.9250016, 2.2105491, "fruits");
		
		//Créer les produits
		Produit p1 = new Produit("Le masoulier rose 2019", "vin rosé", 5.65, false);
		Produit p2 = new Produit("Chateau du Bousquet 2018", "vin rouge", 9.90, true);
		Produit p3 = new Produit("Camembert de Normandie AOP", "fromage", 2.53, true);
		Produit p4 = new Produit("Pomme Golden au kilo", "pomme", 1.99, true);
		
		//Ajouter les produits dans les producteurs (et vice versa)
		P1.add(p1);
		P1.add(p2);
		P2.add(p3);
		P3.add(p4);
		
		//Sauvegarder les producteurs dans la base de données
		repository.save(P1);
		repository.save(P2);
		repository.save(P3);
		
		
	}

}
