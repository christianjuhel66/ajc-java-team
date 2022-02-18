package com.github.constructeur.entities.personnes;

public class Plombier implements Artisan {

    private String nom;
    private String prenom;
    private float tarif;

    public Plombier() {
    }

    public Plombier(String nom, String prenom, float tarif) {
        this.nom = nom;
        this.prenom = prenom;
        this.tarif = tarif;
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

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public float getTarif() {
        return tarif;
    }

    @Override
    public String toString() {
        return "Plombier{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tarif=" + tarif +
                '}';
    }
}
