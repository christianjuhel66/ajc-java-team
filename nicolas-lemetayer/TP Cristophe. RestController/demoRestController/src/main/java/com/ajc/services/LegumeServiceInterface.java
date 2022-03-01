package com.ajc.services;

import com.ajc.entities.Fruit;
import com.ajc.entities.Legume;

import java.util.List;

public interface LegumeServiceInterface {
    public List<Legume> findAll();
    public Long save(Legume legume);
    public void delete(Legume legume);
}
