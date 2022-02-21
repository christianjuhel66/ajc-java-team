package com.projet.projetrestaurant.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data // fait référence aux getter & setter
@NoArgsConstructor // fait référence au constructeur
@ToString // fait référence au ToString
@Table(name = "gerant")
public class Gerant {

	// Step 1: définir les champs d'application
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "restaurant")
	private String restaurant;

	public Gerant(String nom, String prenom, String restaurant) {
		this.nom = nom;
		this.prenom = prenom;
		this.restaurant = restaurant;
	}

}
