package com.artisanat.model;

public class Bois implements Materiau {

    @Override
    public String presenterMateriau() {
        return new String("Materiau utilisé: bois");
    }
}
