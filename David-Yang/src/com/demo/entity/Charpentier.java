package com.demo.entity;

public final class Charpentier extends Artisan {

	private ImplEtude etude;
	private ImplDecoupageMateriaux decoupe;

	public Charpentier(ImplEtude etude, ImplDecoupageMateriaux decoupe) {
		this.etude = etude;
		this.decoupe = decoupe;
		System.out.println("Creation d'un " + this.getClass().getSimpleName() + " sans parametres");
	}

	public Charpentier(String nom, String prenom, String adresse, Integer age, ImplEtude etude,
			ImplDecoupageMateriaux decoupe) {
		super(nom, prenom, adresse, age);
		this.etude = etude;
		this.decoupe = decoupe;
		System.out.println("Creation d'un " + this.getClass().getSimpleName());
	}

	public String getDevis() {
		return etude.devis() + this.getClass().getSimpleName();
	}

	public String getDecoupe() {
		return decoupe.decoupe();
	}
}
