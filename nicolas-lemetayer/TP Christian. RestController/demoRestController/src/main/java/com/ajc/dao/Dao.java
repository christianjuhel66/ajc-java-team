package com.ajc.dao;

import com.ajc.entities.Fruit;
import com.ajc.entities.Legume;
import com.ajc.entities.Panier;

import java.util.List;

public interface Dao {
    public List<Fruit> findAll();
    public Long save(Fruit fruit);

    public List<Legume> FindAllLegumes();
    public Long saveLegume(Legume legume);

    public Panier findPanier(Long id);
    public Long savePanier(Panier panier);
}
