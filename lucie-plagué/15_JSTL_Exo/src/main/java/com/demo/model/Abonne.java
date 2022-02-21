package com.demo.model;

public class Abonne {
	
	
	private String prenom;
	private String nom;
	private String adresse;
	private Integer typeAbonnement;
	/* 1 = abo classique
	 * 2 = abo duo
	 * 3 = abo premium
	 * 0, null, autre = non abonné
	 */
	
	// Constructeurs
	public Abonne() {}
	
	public Abonne(String prenom, String nom, String adresse, int typeAbonnement) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.typeAbonnement = typeAbonnement;
	}

	public String getPrenom() {
		return prenom;
	}

	
	// Getters - Setters
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTypeAbonnement() {
		return typeAbonnement;
	}

	public void setTypeAbonnement(Integer typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}

	
}
