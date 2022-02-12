package com.agencetravaux.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // j'annote ma classe pour que spring la détecte
public class Metallier implements Artisan {

    private final PrepareService dependance;

    // j'annote ma méthode pour me permettre d'injecter ma dépendance
    @Autowired
    public Metallier(PrepareService service) {
        this.dependance = service;
    }

    // je définis ce que ma méthode déclarée dans mon interface exécute
    @Override
    public String decoupe() {
        return "Je sais découper du métal";
    }

    @Override
    public String faireUnDevis() {
        return dependance.faireUnDevis();
    }
}
