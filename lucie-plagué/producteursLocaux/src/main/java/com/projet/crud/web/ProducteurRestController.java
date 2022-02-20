package com.projet.crud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.crud.Entity.Producteur;
import com.projet.crud.metier.ProducteurServiceInterface;

@RestController
public class ProducteurRestController {

	@Autowired
	private ProducteurServiceInterface producteurService;

	// Contructeur
	@Autowired
	public ProducteurRestController(ProducteurServiceInterface producteurService) {
		this.producteurService = producteurService;
	}

	// Setter
	@Autowired
	public void setProducteurService(ProducteurServiceInterface producteurService) {
		this.producteurService = producteurService;
	}

	// Mapping pour URL
	@GetMapping("/premiertest")
	public String premierTest() {
		return "Je fonctionne correctement";
	}

	@GetMapping("/appelFindAll")
	public List<Producteur> findAll() {
		System.out.println("Passage dans la méthode findAll()");
		return producteurService.findAll();
	}

	@GetMapping("/create")
	public Producteur create() {
		System.out.println("Je passe par create endpoint, pour créer un producteur");
		Producteur prod = new Producteur("Tintin", "numero affiché", "Auteuil-Le-Roi", "farine", true);
		producteurService.save(prod);
		return prod;
	}

	@GetMapping("/findById")
	public Producteur findId() {
		System.out.println("Je passe par findById endpoint pour retourner un élément recherché par son id");
		Long id = 1L;
		return producteurService.findById(id);

	}

	@GetMapping("/update")
	public Producteur update() {
		System.out.println("passage par update endpoint pour mettre à jour dans la db");
		Producteur prod = producteurService.findById(2L);
		prod.setNom("inconnu");
		prod.setProduit("produit modifié");
		producteurService.save(prod);
		return prod;
	}

	@GetMapping("/delete")
	public void delete() {
		System.out.println("passage par delete endpoint pour supprimer un élément de la db");

		producteurService.deleteById(3L);
	}
}
