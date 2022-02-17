package com.github.constructeur.entities;

import com.github.constructeur.entities.constructions.Construction;
import com.github.constructeur.entities.personnes.Artisan;
import com.github.constructeur.entities.materiaux.Materiau;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Devis implements Facture {

    private Construction construction;
    private List<Materiau> listeMateriaux;
    private List<Artisan> listeArtisans;

    public Devis() {
        this.listeMateriaux = new ArrayList<>();
        this.listeArtisans = new ArrayList<>();
    }

    public Devis(Construction construction, List<Materiau> listeMateriaux, List<Artisan> listeArtisans) {
        this.construction = construction;
        this.listeMateriaux = listeMateriaux;
        this.listeArtisans = listeArtisans;
    }

    @Override
    public void afficherFacture() {

        float prixTotal = 0;


        /*for (Materiau m : this.listeMateriaux) {
            prixTotal += m.getPrixMateriau();
        }
        for (Artisan a : this.listeArtisans) {
            prixTotal += a.getTarif();
        }*/

        System.out.println(this.listeArtisans.stream().map(artisan -> artisan.getTarif()).collect(Collectors.toList()));


        System.out.println(
                "CONSTRUCTION: " + this.construction + "\n" +
                        "ARTISANS: " + this.listeArtisans.toString() + "\n" +
                        "MATERIAUX: " + this.listeMateriaux.toString() + "\n" +
                        "PRIX TOTAL: " + prixTotal
        );
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }

    public List<Materiau> getListeMateriaux() {
        return listeMateriaux;
    }

    public void setListeMateriaux(List<Materiau> listeMateriaux) {
        this.listeMateriaux = listeMateriaux;
    }

    public List<Artisan> getListeArtisans() {
        return listeArtisans;
    }

    public void setListeArtisans(List<Artisan> listeArtisans) {
        this.listeArtisans = listeArtisans;
    }

    @Override
    public String toString() {
        return "Devis{" +
                "construction=" + construction +
                ", listeMateriaux=" + listeMateriaux +
                ", listeArtisans=" + listeArtisans +
                '}';
    }
}
