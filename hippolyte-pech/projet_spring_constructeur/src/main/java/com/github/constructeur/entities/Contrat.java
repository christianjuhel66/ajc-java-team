package com.github.constructeur.entities;

import com.github.constructeur.entities.constructions.Construction;
import com.github.constructeur.entities.materiaux.Materiau;
import com.github.constructeur.entities.personnes.Artisan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Contrat implements Facture {

    @Autowired
    private Construction construction;

    @Autowired
    private List<Materiau> listeMateriaux;

    @Autowired
    private List<Artisan> listeArtisans;

    public Contrat() {

    }

    @Override
    public void afficherFacture() {

        double prixTotal = 0;


        /*for (Materiau m : this.listeMateriaux) {
            prixTotal += m.getPrixMateriau();
        }
        for (Artisan a : this.listeArtisans) {
            prixTotal += a.getTarif();
        }*/

        System.out.println(this.listeMateriaux.stream().map(materiau -> materiau.getPrixMateriau()).collect(Collectors.toList()));
        double sumMateriaux = this.listeMateriaux.stream().collect(Collectors.summingDouble(value -> value.getPrixMateriau()));

        System.out.println(this.listeArtisans.stream().map(artisan -> artisan.getTarif()).collect(Collectors.toList()));
        double sumArtisans = this.listeArtisans.stream().collect(Collectors.summingDouble(value -> value.getTarif()));

        prixTotal = sumArtisans + sumMateriaux;

        System.out.println(
                "-----AFFICHAGE DU CONTRAT-----" +
                        "\tCONSTRUCTION: " + this.construction + "\n" +
                        "\tARTISANS: " + this.listeArtisans.toString() + "\n" +
                        "\tMATERIAUX: " + this.listeMateriaux.toString() + "\n" +
                        "\tPRIX TOTAL: " + prixTotal
        );
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "construction=" + construction +
                ", listeMateriaux=" + listeMateriaux +
                ", listeArtisans=" + listeArtisans +
                '}';
    }
}
