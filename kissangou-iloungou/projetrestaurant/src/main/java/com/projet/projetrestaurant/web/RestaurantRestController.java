package com.projet.projetrestaurant.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.projetrestaurant.dao.DaoInterface;
import com.projet.projetrestaurant.entities.Employes;

// Step 1: annotation du RestController
@RestController
public class RestaurantRestController {

	// Step 4: injection de la dao avec un Autowired
	@Autowired
	private DaoInterface dao;

	// Step 2: création méthode pour vérifier si test OK
	// + annotation GetMapping pour la correspondance avec le protocole Http
	@GetMapping("/testinitial")
	public String test() {
		return "Test OK";

	}

	// Step 3: création second Mapping pour exécuter le findAll
	@GetMapping("/testFindAll")
	public List<Employes> findAll() {
		return dao.findAll();

	}

}
