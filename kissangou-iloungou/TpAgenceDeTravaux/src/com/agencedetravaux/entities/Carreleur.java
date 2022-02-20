package com.agencedetravaux.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("carreleur")
public class Carreleur implements Artisans {

	// Injection de dependance sur la déclaration de l'attribut
	@Autowired
	@Qualifier("decoupageCarrelage")
	private Decoupage decoupage;

	@Override
	public void faireUnDevis() {
		System.out.println("Je fais un devis de carreleur");

	}

	@Override
	public String getDecoupage() {
		return decoupage.decoupageDeMateriaux();
	}

}
