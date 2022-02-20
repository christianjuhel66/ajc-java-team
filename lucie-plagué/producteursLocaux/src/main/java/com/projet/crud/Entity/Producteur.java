package com.projet.crud.Entity;

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
@Data
@NoArgsConstructor
@ToString
@Table(name = "producteur")
public class Producteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nom;

	@Column
	private String numero;

	@Column
	private String ville;

	@Column
	private String produit;

	@Column
	private boolean bio;

	// Constructeur
	public Producteur(String nom, String numero, String ville, String produit, boolean bio) {
		this.nom = nom;
		this.numero = numero;
		this.ville = ville;
		this.produit = produit;
		this.bio = bio;
	}
}
