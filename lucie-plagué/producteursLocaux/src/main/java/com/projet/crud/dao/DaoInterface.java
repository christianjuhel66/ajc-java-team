package com.projet.crud.dao;

import java.util.List;

import com.projet.crud.Entity.Producteur;

public interface DaoInterface {

	public List<Producteur> findAll();

	public Producteur findById(Long id);

	public Long save(Producteur producteur);

	public void deleteById(Long id);
}
