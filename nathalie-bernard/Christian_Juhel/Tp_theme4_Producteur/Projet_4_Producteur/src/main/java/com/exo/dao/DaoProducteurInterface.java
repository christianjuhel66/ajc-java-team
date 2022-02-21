package com.exo.dao;

import java.util.List;

import com.exo.entities.Producteur;

//Fait le lien entre la couche Service et la couche persistante (base de données)
public interface DaoProducteurInterface {

	public List<Producteur> findAll();

	public Producteur findById(Long id);

	public Long save(Producteur producteur);

	public void deleteById(Long id);

}
