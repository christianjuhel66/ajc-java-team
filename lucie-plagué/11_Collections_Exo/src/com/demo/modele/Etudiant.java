package com.demo.modele;

public class Etudiant {

	// Attributs
	private String nom;
	private String prenom;
	private boolean joueurQuidditch;
	
	// Constructeur
	public Etudiant(String prenom, String nom, boolean joueurQuidditch) {
		this.nom = nom;
		this.prenom = prenom;
		this.joueurQuidditch = joueurQuidditch;
	}

	// Méthode
	public String getPrenomNom() {
		return "Je suis "+prenom+" "+nom;
	}
	
	
	// Accesseurs et Mutateurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isJoueurQuidditch() {
		return joueurQuidditch;
	}

	public void setJoueurQuidditch(boolean joueurQuidditch) {
		this.joueurQuidditch = joueurQuidditch;
	}
	
	
}
