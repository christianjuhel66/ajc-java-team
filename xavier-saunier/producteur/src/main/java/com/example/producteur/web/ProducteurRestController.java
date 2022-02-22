package com.example.producteur.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.producteur.entity.Producteur;
import com.example.producteur.service.ProducteurServiceInterface;

public class ProducteurRestController {

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

    // read
    @GetMapping("/findById")
    public Producteur findId() {
	System.out.println("lecture");
	int id = 1;
	return psi.findById(id);
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
