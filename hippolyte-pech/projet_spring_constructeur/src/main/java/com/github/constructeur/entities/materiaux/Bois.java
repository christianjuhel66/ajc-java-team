package com.github.constructeur.entities.materiaux;

public class Bois implements Materiau {
    private String typeMateriau;

    private float prixMateriau = 5;

    @Override
    public float getPrixMateriau() {
        return prixMateriau;
    }
}
