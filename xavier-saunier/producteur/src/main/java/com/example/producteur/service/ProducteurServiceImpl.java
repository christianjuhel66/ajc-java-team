package com.example.producteur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.producteur.dao.DaoInterface;
import com.example.producteur.entity.Producteur;

@Service
public class ProducteurServiceImpl implements ProducteurServiceInterface {

    @Autowired
    private DaoInterface dao;

    @Override
    @Transactional
    public List<Producteur> findAll() {
	return dao.findAll();
    }

    @Override
    @Transactional
    public Producteur findById(int id) {

	return dao.findById(id);
    }

    @Override
    @Transactional
    public int save(Producteur producteur) {

	return dao.save(producteur);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
	dao.deleteById(id);

    }

}
