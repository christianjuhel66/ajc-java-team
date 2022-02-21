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
@Table(name = "employes")
public class Employes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "metier")
	private String metier;

	@Column(name = "portable")
	private String portable;

	public Employes(String prenom, String metier, String portable) {
		this.prenom = prenom;
		this.metier = metier;
		this.portable = portable;
	}

}