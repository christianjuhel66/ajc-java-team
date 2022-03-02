package com.restaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employe")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "prenom", nullable = false)
	private String prenom;

	@Column(name = "metier")
	private String metier;

	@Column(name = "portable")
	private String portable;

	// Commenter toutes les parties ci-dessous pour afficher le GET REST API pour la
	// liste des employes et GET REST API recherche par id
	// http://localhost:8080/api/employes
	public Employe(String prenom, String metier, String portable) {
		this.prenom = prenom;
		this.metier = metier;
		this.portable = portable;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getPortable() {
		return portable;
	}

	public void setPortable(String portable) {
		this.portable = portable;
	}

}
