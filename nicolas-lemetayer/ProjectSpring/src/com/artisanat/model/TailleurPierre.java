package com.artisanat.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TailleurPierre extends Artisan  {
    private SciePierre sciePierre;

    @Autowired
    public TailleurPierre(@Value("${descriptionTailleurPierre}") String description,
                       @Value("${formationTailleurPierre}") String formation,
                       @Value("${secteurTailleurPierre}") String secteur,
                       @Value("${revenusTailleurPierre}") String revenus,
                          SciePierre sciePierre) {
        super(description,formation, secteur, revenus);
        this.sciePierre = sciePierre;
    }

    public SciePierre getSciePierre() {
        return sciePierre;
    }

    public void setSciePierre(SciePierre sciePierre) {
        this.sciePierre = sciePierre;
    }

    public void lancerTravaux(){
        super.lancerTravaux();
        System.out.println(sciePierre.getMateriau().presenterMateriau());
        sciePierre.preparerMateriau();
        sciePierre.utiliserMateriau();
    }
}
