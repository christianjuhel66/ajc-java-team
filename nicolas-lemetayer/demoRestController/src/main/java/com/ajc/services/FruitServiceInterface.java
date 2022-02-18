package com.ajc.services;

import com.ajc.entities.Fruit;
import java.util.List;

public interface FruitServiceInterface {
    public List<Fruit> findAll();
    public Long save(Fruit fruit);
}
