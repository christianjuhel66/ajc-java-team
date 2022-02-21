package com.ecole.stagiaires.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Stagiaire")
public class Stagiaire {
	
	public Stagiaire() {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "age")
	private int age;
	
	public Stagiaire(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Stagiaire(String nom, String prenom,String adresse, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stagiaire : id: " + id + ", nom: " + nom + ", prenom: " + prenom + ", adresse: " + adresse + ", age: " + age;
	}

}
