package com.agence.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ebeniste")
public class Ebeniste implements Artisan {

	private Decoupage decoupage;

	// Injection de dépendance avec le setter
	@Autowired
	public void setDecoupage(@Qualifier("decoupageBois") Decoupage decoupage) {
		this.decoupage = decoupage;
	}

	@Override
	public void faireUnDevis() {
		System.out.println("Je fais un devis d'ébéniste");

	}

	@Override
	public String getDecoupage() {
		return decoupage.decoupageDeMateriaux();
	}

}
