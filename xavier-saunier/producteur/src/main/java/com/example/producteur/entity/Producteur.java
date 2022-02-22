package com.example.producteur.entity;

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
    private int id;

    @Column
    private String nom;

    @Column
    private String numero;

    @Column
    private String ville;

    @Column
    private String produits;

    @Column
    private boolean bio;

    public Producteur(String nom, String numero, String ville, String produits, boolean bio) {
	this.nom = nom;
	this.numero = numero;
	this.ville = ville;
	this.produits = produits;
	this.bio = bio;
    }
}
