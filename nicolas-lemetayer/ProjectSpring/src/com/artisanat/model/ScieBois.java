package com.artisanat.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScieBois implements DecoupeMateriau {
    Bois materiau = new Bois();

    @Autowired
    public ScieBois(){
        this.materiau = new Bois();
    }

    public Bois getMateriau() {
        return materiau;
    }

    public void setMateriau(Bois materiau) {
        this.materiau = materiau;
    }

    @Override
    public String presenterMateriau() {
        return "Une scie bois est un outil à une lame dentée en acier trempé, destinée à couper du bois... Elle est actionnée par divers moyens tels que la force musculaire, l'électricité ou l'eau.";
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
