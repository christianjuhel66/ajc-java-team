package com.ecole.demo.stagiaire.entity;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employe")
public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="age")
	private int age;
	
	@Column(name="adresse")
	private String adresse;
	
	public Employe(String nom, String prenom, int age, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}

}
