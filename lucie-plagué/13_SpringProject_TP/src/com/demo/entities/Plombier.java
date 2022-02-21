package com.demo.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Plombier implements Artisan {

	private int id;
	private String nom;
	private String prenom;
	private int age;

	@Autowired // injection de l'interface Decoupage
	@Qualifier("decoupagePVC")
	private Decoupage decoupage;

	// Constructeur
	public Plombier() {
		System.out.println("Plombier: à  l'intérieur du constructeur de Plombier");
	}

	// Méthodes

	@Override // réécriture de la méthode de l'interface Artisan
	public String redigerDevis() {
		return "Je crée un devis de plomberie";
	}

	@Override	// réécriture de la méthode de l'interface Artisan avec élément de l'interface Decoupage
	public String decoupage() {
		return decoupage.decoupageMateriel();
	}

	public String toString(String nom, String prenom, int age) {
		return "Je m'appelle " + prenom + " " + nom + ", j'ai " + age + " et je suis plombier.";
	}

	@PostConstruct
	public void myInitMethode() {
		System.out.println("Plombier : méthode à la création du bean ");
	}

	@PreDestroy
	public void myDestroyMethode() {
		System.out.println("Plombier : méthode à la destruction du bean ");
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

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public void setDecoupageMateriau(Decoupage decoupage) {
		this.decoupage = decoupage;
	}
}
