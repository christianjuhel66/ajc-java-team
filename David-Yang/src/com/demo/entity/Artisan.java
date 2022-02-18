package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Artisan")
public class Artisan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@Column(name = "nom")
	protected String nom;
	@Column(name = "prenom")
	protected String prenom;
	@Column(name = "adresse")
	protected String adresse;
	@Column(name = "age")
	protected Integer age;

	public Artisan() {
		System.out.println("Creation d'un " + this.getClass().getSimpleName() + " sans parametres ARTISAN");
	}

	public Artisan(String nom, String prenom, String adresse, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
		System.out.println("Creation d'un " + this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
