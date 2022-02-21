package com.ajc.demo.bibliotheque.model;

public class Livre {
    private String titre;
    private String auteur;
    private Integer prix;
    private String editeur;
    private String typeEdition;
    private String[] genres;

    public Livre(String titre, String auteur, Integer prix, String editeur, String typeEdition, String[] genres) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.editeur = editeur;
        this.typeEdition = typeEdition;
        this.genres = genres;
    }

    public Livre() {
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

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getTypeEdition() {
        return typeEdition;
    }

    public void setTypeEdition(String typeEdition) {
        this.typeEdition = typeEdition;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
