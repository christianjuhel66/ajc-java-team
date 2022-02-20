package com.github.constructeur.entities.materiaux;

public class Ciment implements Materiau {
    private String typeMateriau;

    private float prixMateriau = 25f;

    @Override
    public float getPrixMateriau() {

        return prixMateriau;
    }
}
