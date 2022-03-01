package com.exo.metier;

import java.util.List;

import com.exo.entities.Produit;

public interface ProduitServiceInterface {

	public List<Produit> findAll();

	public Produit findById(Long id);

	public Long save(Produit producteur);

	public void deleteById(Long id);
}
