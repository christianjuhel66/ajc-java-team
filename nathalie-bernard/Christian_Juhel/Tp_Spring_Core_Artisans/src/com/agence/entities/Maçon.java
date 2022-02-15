package com.agence.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("macon")
public class Ma�on implements Artisan {

	private Decoupage decoupage;

	// Injection de d�pendance avec le constructeur
	@Autowired
	public Ma�on(@Qualifier("decoupagePierre") Decoupage decoupage) {
		this.decoupage = decoupage;
	}

	@Override
	public void faireUnDevis() {
		System.out.println("Je fais un devis de ma�on");
	}

	@Override
	public String getDecoupage() {
		return decoupage.decoupageDeMateriaux();
	}

}
