package com.artisan.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sculpteur")
public class Sculpteur implements Artisan{

	// Attributes
	private String typeSculpture;
	
	private Tailler taille;
	
	// Constructors
	@Autowired
	public Sculpteur(@Qualifier("TaillerPierre")Tailler taille) {
		this.taille = taille;
	}
	
	// Methods
	@Override
	public String getOutils() {
		return "J'utilise un couteau de sculpteur";
	}
	
	@Override
	public String getDevis() {
		return "Je réalise un devis pour un musée";
	}
	
	@Override
	public String getTailler() {
		return taille.taillerMateriau();
	}
	
	// Getters and Setters
	public String getTypeSculpture() {
		return typeSculpture;
	}

	public void setTypeSculpture(String typeSculpture) {
		this.typeSculpture = typeSculpture;
	}
	
}
