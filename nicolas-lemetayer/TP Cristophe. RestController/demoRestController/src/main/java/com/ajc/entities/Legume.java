package com.ajc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="legume")
public class Legume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "variete")
    private String variete;

    @Column(name = "prix_kg")
    private double prixKg;

    @Column(name = "descriptif")
    private String descriptif;

    public Legume(String nom, String variete, double prixKg, String descriptif) {
        this.nom = nom;
        this.variete = variete;
        this.prixKg = prixKg;
        this.descriptif = descriptif;
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

    public String getVariete() {
        return variete;
    }

    public void setVariete(String variete) {
        this.variete = variete;
    }

    public double getPrixKg() {
        return prixKg;
    }

    public void setPrixKg(double prixKg) {
        this.prixKg = prixKg;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
}
