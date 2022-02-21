package com.example.demo.entities;

import java.util.LinkedHashMap;


public class Livre {
    private String titre;
    private String auteur;
    private float prix;
    //private String editeur;
    //private LinkedHashMap<String, String> editeursListe;

    /*public Livre(){
        editeursListe = new LinkedHashMap<>();
        editeursListe.put("HAC","Hachette");
        editeursListe.put("EDI","Editis");
        editeursListe.put("GAL","Gallimard");
        editeursListe.put("ALB","Albin Michel");
        editeursListe.put("ACT","Actes Sud");
    }

    public Livre(String titre, String auteur, Integer prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }*/

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

    /*
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
    }*/
}
