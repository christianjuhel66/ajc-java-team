package com.example.demo.entities;

import java.util.LinkedHashMap;


public class Livre {
    private String titre;
    private String auteur;
    private float prix;
    private String editeur;
    private LinkedHashMap<String, String> editeursListe;
    private String edition;
    private LinkedHashMap<String, String> editionsListe;;
    private String[] genres;

    public Livre(){
        editeursListe = new LinkedHashMap<>();
        editeursListe.put("Hachette","Hachette");
        editeursListe.put("Editis","Editis");
        editeursListe.put("Gallimard","Gallimard");
        editeursListe.put("Albin Michel","Albin Michel");
        editeursListe.put("Actes Sud","Actes Sud");

        editionsListe = new LinkedHashMap<>();
        editionsListe.put("Classique","Classique");
        editionsListe.put("Poche","Poche");

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    public LinkedHashMap<String, String> getEditeursListe() {
        return editeursListe;
    }
    public void setEditeursListe(LinkedHashMap<String, String> editeursListe) {
        this.editeursListe = editeursListe;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public LinkedHashMap<String, String> getEditionsListe() {
        return editionsListe;
    }

    public void setEditionsListe(LinkedHashMap<String, String> editionsListe) {
        this.editionsListe = editionsListe;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
