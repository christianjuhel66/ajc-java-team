package com.tp.formation.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table(name = "professeur")
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "matiere")
    private String matiere;

    public Professeur(String nom, String prenom, String matiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.matiere = matiere;
    }
}
