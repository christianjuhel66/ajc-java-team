package com.github.constructeur.entities.materiaux;

public class Beton implements Materiau {
    private String typeMateriau;

    private float prixMateriau = 10f;

    @Override
    public float getPrixMateriau() {

        return prixMateriau;
    }
}
