package com.exo.metier;

import java.util.List;

import com.exo.entities.Producteur;

public interface ProducteurServiceInterface {

	public List<Producteur> findAll();

	public Producteur findById(Long id);

	public Long save(Producteur Producteur);

	public void deleteById(Long id);
}
