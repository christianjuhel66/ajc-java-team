package com.artisanat.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Charpentier extends Artisan {
    private ScieBois scieBois;

    @Autowired
    public Charpentier(@Value("${descriptionCharpentier}") String description,
                       @Value("${formationCharpentier}") String formation,
                       @Value("${secteurCharpentier}") String secteur,
                       @Value("${revenusCharpentier}") String revenus,
                       ScieBois scieBois) {
        super(description,formation, secteur, revenus);
        this.scieBois = scieBois;
    }

    public ScieBois getScieBois() {
        return scieBois;
    }

    public void setScieBois(ScieBois scieBois) {
        this.scieBois = scieBois;
    }

    public void lancerTravaux(){
        super.lancerTravaux();
        System.out.println(scieBois.getMateriau().presenterMateriau());
        scieBois.preparerMateriau();
        scieBois.utiliserMateriau();
    }
}
