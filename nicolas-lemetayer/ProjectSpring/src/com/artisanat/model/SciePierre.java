package com.artisanat.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SciePierre implements DecoupeMateriau {
    Pierre materiau = new Pierre();

    @Autowired
    public SciePierre(){
        this.materiau = new Pierre();
    }

    public Pierre getMateriau() {
        return materiau;
    }

    public void setMateriau(Pierre materiau) {
        this.materiau = materiau;
    }

    @Override
    public String presenterMateriau() {
        return "Une scie pierre est un outil à une lame dentée en acier trempé, destinée à couper de la pierre... Elle est actionnée par divers moyens tels que la force musculaire, l'électricité ou l'eau.";
    }

    @Override
    public void preparerMateriau() {
        System.out.println("Je prépare ma scie");
    }

    @Override
    public void utiliserMateriau() {
        System.out.println("J'utilise ma scie");
    }
}
