package com.example.producteur.crud.dao;

import java.util.List;

import com.example.producteur.entity.Producteur;

//CRUD
public interface DaoInterface {

    public List<Producteur> findAll();

    public Producteur findById(int id);

    public int save(Producteur producteur);

    public void deleteById(int id);

}
