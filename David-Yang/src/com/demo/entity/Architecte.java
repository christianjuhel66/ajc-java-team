package com.demo.entity;

public final class Architecte extends Artisan {
	
	public Architecte(ImplEtude etude) {
		System.out.println("Creation d'un " + this.getClass().getSimpleName() + " sans parametres");
		this.etude = etude;

	}

	private ImplEtude etude;

	public Architecte(String nom, String prenom, String adresse, Integer age, ImplEtude etude) {
		super(nom, prenom, adresse, age);
		this.etude = etude;
	}

	public String getDevis() {
		return etude.devis() + this.getClass().getSimpleName();
	}

}
