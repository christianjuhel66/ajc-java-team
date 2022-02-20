package com.projet.crud.metier;

import java.util.List;

import com.projet.crud.Entity.Producteur;

public interface ProducteurServiceInterface {

	public List<Producteur> findAll();

	public Producteur findById(Long id);

	public Long save(Producteur producteur);

	public void deleteById(Long id);
}
