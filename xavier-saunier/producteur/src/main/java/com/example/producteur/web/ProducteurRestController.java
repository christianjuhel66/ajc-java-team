package com.example.producteur.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.producteur.entity.Producteur;
import com.example.producteur.service.ProducteurServiceInterface;

public class ProducteurRestController {

    private List<Producteur> producteurs;

    // definir le PostContruct pour charger les données des producteurs
    @PostConstruct
    public void loadDatas() {
	producteurs = new ArrayList<>();
	producteurs.add(new Producteur("Les fruits de Kadher", "06XXXXXX", "Rambouillet", "fruits et légumes", true));
	producteurs.add(new Producteur("Veronique", "06XXXXXX", "Chartres", "Boulangerie patisserie", true));
	producteurs.add(new Producteur("Dame au boeuf", "06XXXXXX", "Chartres", "viande", true));

    }

    @Autowired
    private ProducteurServiceInterface psi;

    // CRUD
    // create
    @GetMapping("/create")
    public Producteur create() {
	System.out.println("creation");
	Producteur producteur = new Producteur();
	psi.save(producteur);
	return producteur;
    }

    // read All
    @GetMapping("/findAll")
    public List<Producteur> getProducteurs() {
	return psi.findAll();
    }

    // read
    @GetMapping("/find/{id}")
    public Producteur getProducteur(@PathVariable(name = "id") int producteurId) {
	// System.out.println("lecture");

	return ((ProducteurServiceInterface) producteurs).findById(producteurId);
    }

    // update
    @GetMapping("/update")
    public Producteur update() {
	System.out.println("mise à jour");
	Producteur producteur = psi.findById(0);
	producteur.setNom("Dame au Boeufs");
	producteur.setNumero("06XXXXXXXX");
	producteur.setVille("Chartres");
	producteur.setProduits("Viande de boeuf");
	producteur.setBio(true);
	return producteur;
    }

    // delete
    @GetMapping("/delete")
    public void delete() {
	System.out.println("suppression");
	psi.deleteById(0);
    }
}
