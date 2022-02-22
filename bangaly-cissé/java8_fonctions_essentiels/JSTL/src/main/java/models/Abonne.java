package models;

import java.util.List;

public class Abonne {
	// etape 1
	private String prenom;
	private String nom;
	private Integer typeAbonnement;
	private String adresse;
	// etape 4
	private List<Film> films;
	// etape 7
	private Abonne abonneDuo;
	
	public Abonne() {
		
	}
	
	public Abonne(String prenom, String nom, String adresse) {
		
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
	}

	public Abonne(String prenom, String nom, Integer typeAbonnement, String adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.typeAbonnement = typeAbonnement;
		this.adresse = adresse;
	}
	
	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getTypeAbonnement() {
		return typeAbonnement;
	}
	public void setTypeAbonnement(Integer typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Abonne getAbonneDuo() {
		return abonneDuo;
	}

	public void setAbonneDuo(Abonne abonneDuo) {
		this.abonneDuo = abonneDuo;
	}
	
}
