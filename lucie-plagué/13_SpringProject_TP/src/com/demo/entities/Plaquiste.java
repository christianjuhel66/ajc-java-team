package com.demo.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Plaquiste implements Artisan {

	private int id;
	private String nom;
	private String prenom;
	private int age;

	@Autowired // injection de l'interface Decoupage
	@Qualifier("decoupagePlaco")
	private Decoupage decoupage;

	// Constructeur
	public Plaquiste() {
		System.out.println("Plaquiste: à  l'intérieur du constructeur de Plaquiste");
	}

	// Méthodes

	@Override // réécriture de la méthode de l'interface Artisan
	public String redigerDevis() {
		return "Je crée un devis de plaquiste";
	}

	@Override // réécriture de la méthode de l'interface Artisan avec élément de l'interface
				// Decoupage
	public String decoupage() {
		return decoupage.decoupageMateriel();
	}

	public String toString(String nom, String prenom, int age) {
		return "Je m'appelle " + prenom + " " + nom + ", j'ai " + age + " et je suis plaquiste.";
	}

	@PostConstruct
	public void myInitMethode() {
		System.out.println("Plaquiste : méthode à la création du bean ");
	}

	@PreDestroy
	public void myDestroyMethode() {
		System.out.println("Plaquiste : méthode à la destruction du bean ");
	}

	// Getters - Setters
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Decoupage getDecoupage() {
		return decoupage;
	}

	public void setDecoupage(Decoupage decoupage) {
		this.decoupage = decoupage;
	}

}
