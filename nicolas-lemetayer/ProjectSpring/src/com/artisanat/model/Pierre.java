package com.artisanat.model;

public class Pierre implements Materiau {
    @Override
    public String presenterMateriau() {
        return new String("Materiau utilisé: pierre");
    }
}
