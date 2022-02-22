package com.ajc.services;

import com.ajc.entities.Fruit;
import com.ajc.entities.Panier;

public interface PanierServiceInterface {
    public Panier findById(Long id);
    public Long save(Panier panier);
}
