package com.exo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exo.entities.Producteur;
import com.exo.entities.Produit;
import com.exo.metier.ProducteurServiceInterface;
import com.exo.metier.ProduitServiceInterface;

@RestController
public class ProducteurRestController {

	@Autowired
	private ProducteurServiceInterface producteurService;
	
	@Autowired
	private ProduitServiceInterface produitService;

	//Retourne le contenu de la table producteur
	@GetMapping("/findAllProducteur")
	public List<Producteur> findAllProducteur() {
		return producteurService.findAll();
	}
	
	//Retourne le contenu de la table produit
	@GetMapping("/findAllProduit")
	public List<Produit> findAllProduit() {
		return produitService.findAll();
	}

	//Creation d'un producteur dans la table Producteur
	@GetMapping("/createProducteur")
	public Producteur createProducteur() {
		Producteur p = new Producteur("Jean", "Martin", "0651517766","Paris", 48.862725, 2.287592, "produits laitiers");
		producteurService.save(p);
		return p;
	}
	
	//Creation d'un produit dans la table Produit
		@GetMapping("/createProduit")
		public Produit createProduit() {
			Produit p = new Produit("Pomme Pink Lady au kilo", "pomme", 1.75, false);
			produitService.save(p);
			return p;
		}
	
	//Récupérer le producteur dont l'id vaut 1
	@GetMapping("/findByIdProducteur")
	public Producteur findIdProducteur() {
		Long id = 1L;
		return producteurService.findById(id);

	}
	
	//Récupérer le produit dont l'id vaut 1
	@GetMapping("/findByIdProduit")
	public Produit findIdProduit() {
		Long id = 1L;
		return produitService.findById(id);

	}
	
	//Modifier les informations d'un producteur via son id
	@GetMapping("/updateProducteur")
	public Producteur updateProducteur() {
		Producteur p = producteurService.findById(2L);
		p.setNom("Dupont");
		p.setPrenom("Marie");
		p.setNumero("0688883433");
		producteurService.save(p);
		return p;
	}
	
	//Modifier les informations d'un produit via son id
	@GetMapping("/updateProduit")
	public Produit updateProduit() {
		Produit p = produitService.findById(2L);
		p.setNom("Chateau du Bousquet 2020");
		produitService.save(p);
		return p;
	}
	
	//Effacer un producteur via son id de la table Producteur
	@GetMapping("/deleteProducteur")
	public void deleteProducteur() {
		producteurService.deleteById(3L);
	}
	
	//Effacer un produit via son id de la table Produit
	@GetMapping("/deleteProduit")
	public void deleteProduit() {
		produitService.deleteById(3L);
	}

}
