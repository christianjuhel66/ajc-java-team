package com.agence.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("macon")
public class Maçon implements Artisan {

	private Decoupage decoupage;

	// Injection de dépendance avec le constructeur
	@Autowired
	public Maçon(@Qualifier("decoupagePierre") Decoupage decoupage) {
		this.decoupage = decoupage;
	}

	@Override
	public void faireUnDevis() {
		System.out.println("Je fais un devis de maçon");
	}

	@Override
	public String getDecoupage() {
		return decoupage.decoupageDeMateriaux();
	}

}
