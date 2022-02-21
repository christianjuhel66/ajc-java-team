package com.projet.projetrestaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.projetrestaurant.dao.DaoInterface;
import com.projet.projetrestaurant.entities.Employes;
import com.projet.projetrestaurant.entities.Gerant;

@SpringBootApplication
public class ProjetrestaurantApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetrestaurantApplication.class, args);
	}

	// Step 1: injection de la dao afin d'effectuer dans un premier temps les
	// méthodes suivantes

	@Autowired
	private DaoInterface repository;

	@Override
	public void run(String... args) throws Exception {
		repository.create(new Gerant("Martin", "Jean", "La Baraque à Martin"));

		repository.create(new Employes("Helise", "Manager", "06.62.54.12.85"));
		repository.create(new Employes("Thomas", "Serveur", "06.25.41.32.14"));
		repository.create(new Employes("Marion", "Serveuse", "06.26.45.87.02"));

	}

}
