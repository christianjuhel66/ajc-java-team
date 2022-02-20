package com.artisan.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ebeniste")
public class Ebeniste implements Artisan{

	// Attributes
	private List<String> meubles;
	
	private Tailler taille;
	
	// Constructors
	@Autowired
	public Ebeniste(@Qualifier("TaillerBois")Tailler taille) {
		this.taille = taille;
	}
	
	// Methods
	@Override
	public String getOutils() {
		return "J'utilise des ciseaux à bois";
	}

	@Override
	public String getDevis() {
		return "Je réalise un devis pour Ikea";
	}
	
	@Override
	public String getTailler() {
		return taille.taillerMateriau();
	}
	
	// Getters and Setters
	public List<String> getMeubles() {
		return meubles;
	}

	public void setMeubles(List<String> meubles) {
		this.meubles = meubles;
	}


}
