package com.exo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "T_producteur")
public class Producteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String numero;
	@Column
	private String ville;
	@Column
	private Double latitude;
	@Column
	private Double longitude;
	@Column
	private String typeDeProduit;
	
	//Un producteur peut vendre plusieurs types de produits
	@ManyToMany(fetch=FetchType.LAZY, cascade= {CascadeType.PERSIST,
			CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH })
			@JoinTable(
			name="producteur_produit",
			joinColumns=@JoinColumn(name="producteur_id"),
			inverseJoinColumns=@JoinColumn(name="produit_id")
			)
	private List<Produit> produits = new ArrayList<>();
	
	public Producteur() {};
	
	public Producteur(String nom, String prenom, String numero, String ville, Double latitude, Double longitude, String typeDeProduit) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.typeDeProduit = typeDeProduit;
	}
	
	public Producteur(long id, String nom, String prenom, String numero, String ville, Double latitude, Double longitude, String typeDeProduit) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.typeDeProduit = typeDeProduit;
	}
	
	public void add(Produit produit) {
		if (produits == null) {
			produits = new ArrayList<>();
		}
		produits.add(produit);
		produit.add(this);
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public String getTypeDeProduit() {
		return typeDeProduit;
	}
	
	public void setTypeDeProduit(String typeDeProduit) {
		this.typeDeProduit = typeDeProduit;
	}

	@Override
	public String toString() {
		return "Producteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", ville="
				+ ville + ", latitude=" + latitude + ", longitude=" + longitude + ", typeDeProduit=" + typeDeProduit
				+ ", produits=" + produits + "]";
	}
	
	
}
