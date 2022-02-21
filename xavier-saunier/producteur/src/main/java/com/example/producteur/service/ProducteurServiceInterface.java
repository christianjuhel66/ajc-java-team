package com.example.producteur.service;

import java.util.List;

import com.example.producteur.entity.Producteur;

public interface ProducteurServiceInterface {
    List<Producteur> findAll();

    Producteur findById(int id);

    int save(Producteur producteur);

    void deleteById(int id);

}
