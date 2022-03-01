package com.exo.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exo.dao.DaoProducteurInterface;
import com.exo.entities.Producteur;
import com.exo.entities.Produit;
import com.exo.exception.ProducteurNotFoundException;
import com.exo.metier.ProducteurServiceInterface;
import com.exo.metier.ProduitServiceInterface;

@RestController
@RequestMapping("/api")
public class ProducteurRestController {

	@Autowired
	private ProducteurServiceInterface producteurService;
	
	@Autowired
	private ProduitServiceInterface produitService;
	
	//definir le postConstruct pour charger les données des employes
	@PostConstruct
	public void loadDatas() {
		
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
		producteurService.save(P1);
		producteurService.save(P2);
		producteurService.save(P3);
	}
	

	//Retourne le contenu de la table producteur
	@GetMapping("/producteurs")
	public List<Producteur> getProducteurs() {
		return producteurService.findAll();
	}
	
	//Retourne le contenu de la table produit
	@GetMapping("/produits")
	public List<Produit> getProduits() {
		return produitService.findAll();
	}

	//Creation d'un producteur dans la table Producteur
	@PostMapping("/producteurs")
	public Producteur createProducteur(@RequestBody Producteur producteur) {
		producteurService.save(producteur);
		return producteur;
	}
	
	//Creation d'un produit dans la table Produit
	@PostMapping("/produits")
	public Produit createProduit(@RequestBody Produit produit) {
		produitService.save(produit);
		return produit;
	}
	
	//Récupérer le producteur avec l'id
	@PutMapping("/producteurs/{id}")
	public Producteur updateProducteur(@PathVariable(name = "id") int producteurId,
			@RequestBody Producteur producteur) {
	
		if((producteurId >= producteurService.findAll().size()) || (producteurId < 0)) {
			throw new ProducteurNotFoundException("Employe id non trouvé - " + producteurId);
		}
		producteurService.save(producteur);
		return producteur;

	}
	
	//Récupérer le produit avec l'id
	@PutMapping("/produits/{id}")
	public Produit updateProduit(@PathVariable(name = "id") int produitId,
			@RequestBody Produit produit) {
		if((produitId >= producteurService.findAll().size()) || (produitId < 0)) {
			throw new ProducteurNotFoundException("Employe id non trouvé - " + produitId);
		}
		produitService.save(produit);
		return produit;

	}
	
	//Modifier les informations d'un producteur via son id
	@GetMapping("/producteurs/{id}")
	public Producteur findProducteur(@PathVariable(name = "id") int producteurId) {
				
	if((producteurId >= producteurService.findAll().size()) || (producteurId < 0)) {
		throw new ProducteurNotFoundException("Employe id non trouvé - " + producteurId);
	}
		return producteurService.findById((long) producteurId);			
	}
	
	//Modifier les informations d'un produit via son id
	@GetMapping("/produits/{id}")
	public Produit findProduit(@PathVariable(name = "id") int produitId) {
		if((produitId >= producteurService.findAll().size()) || (produitId < 0)) {
			throw new ProducteurNotFoundException("Employe id non trouvé - " + produitId);
		}
		return produitService.findById((long) produitId);
	}
	
	//Effacer un producteur via son id de la table Producteur
	@DeleteMapping("/producteurs/{id}")
	public void deleteProducteur(@PathVariable(name="id") int producteurId) {
		producteurService.deleteById((long) producteurId);
	}
	
	//Effacer un produit via son id de la table Produit
	@DeleteMapping("/produits/{id}")
	public void deleteProduit(@PathVariable(name="id") int produitId) {
		produitService.deleteById((long) produitId);
	}

}
