package com.artisanat.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Artisan implements ArtisanService {
    private String description;
    private String formation;
    private String secteur;
    private String revenus;

    public Artisan(String description, String formation, String secteur, String revenus) {
        this.description = description;
        this.formation = formation;
        this.secteur = secteur;
        this.revenus = revenus;
    }


    @PostConstruct
    public void initArtisan(){
        System.out.println("Instanciation d'un nouvel objet: " + this.toString());
    }

    @PreDestroy
    public void destroyArtisan(){
        System.out.println("Destruction d'un objet: " + this.toString());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public void presenterMetier() {
        System.out.println("_______Description du métier_______");
        System.out.println(description);
        System.out.println("_______Formation pour y accéder_______");
        System.out.println(formation);
        System.out.println("_______Secteur_______");
        System.out.println(secteur);
        System.out.println("_______Revenus d'un débutant_______");
        System.out.println(revenus);
    }

    @Override
    public void lancerTravaux() {
        System.out.println("_______Lancement des travaux_______");
    }

}
