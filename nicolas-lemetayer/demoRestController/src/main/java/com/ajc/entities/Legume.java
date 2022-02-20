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
}
