package com.agencetravaux.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Verrier implements Artisan {

    private final PrepareService dependance;

    @Autowired
    public Verrier(PrepareService service) {
        this.dependance = service;
    }
    @Override
    public String decoupe() {
        return "Je sais découper du verre";
    }

    @Override
    public String faireUnDevis() {
        return dependance.faireUnDevis();
    }
}
