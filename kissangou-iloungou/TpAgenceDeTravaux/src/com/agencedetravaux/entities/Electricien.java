package com.agencedetravaux.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("electricien")
public class Electricien implements Artisans {

	private Decoupage decoupage;

	// Injection de dépendance avec le constructeur
	@Autowired
	public Electricien(@Qualifier("decoupageCable") Decoupage decoupage) {
		this.decoupage = decoupage;
	}

	@Override
	public void faireUnDevis() {
		System.out.println("Je fais un devis d'électricien");
	}

	@Override
	public String getDecoupage() {
		return decoupage.decoupageDeMateriaux();
	}

}
