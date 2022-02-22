package com.example.producteur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.producteur.crud.dao.DaoInterface;
import com.example.producteur.entity.Producteur;

public class ProducteurServiceImpl implements ProducteurServiceInterface {

    @Autowired
    private DaoInterface dao;

    @Override
    public List<Producteur> findAll() {
	return dao.findAll();
    }

    @Override
    public Producteur findById(int id) {

	return dao.findById(id);
    }

    @Override
    public int save(Producteur producteur) {

	return dao.save(producteur);
    }

    @Override
    public void deleteById(int id) {
	dao.deleteById(id);

    }

}
