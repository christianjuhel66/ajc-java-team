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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@Table(name = "T_produit")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nom;
	@Column
	private String categorie;
	@Column
	private Double prix;
	@Column
	private boolean bio;
	
	//Pour éviter une récursion infinie dûe à la liaison bidirectionnelle,
	//cette attribut n'est pas sérialisée
	@JsonBackReference
	//Un type de produits peut être vendu par différents producteurs
	@ManyToMany(mappedBy = "produits")
	private List<Producteur> producteurs = new ArrayList<>();
	
	public Produit(String nom, String categorie, Double prix, boolean bio) {
		this.nom = nom;
		this.prix = prix;
		this.bio = bio;
		this.categorie = categorie;
	}
	
	public void add(Producteur producteur) {
		if (producteurs == null) {
			producteurs = new ArrayList<>();
		}
		producteurs.add(producteur);
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
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.nom = categorie;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public boolean isBio() {
		return bio;
	}
	
	public void setBio(boolean bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", prix=" + prix + ", bio=" + bio
				+ "]";
	}
	
	
	
}
