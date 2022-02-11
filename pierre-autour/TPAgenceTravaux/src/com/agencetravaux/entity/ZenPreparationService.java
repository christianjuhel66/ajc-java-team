package com.agencetravaux.entity;

import org.springframework.stereotype.Component;

@Component
public class ZenPreparationService implements PrepareService{

    @Override
    public String faireUnDevis() {
        return "ok je prépare un devis";
    }
}
