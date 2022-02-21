package com.exo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exo.dao.DaoProduitInterface;
import com.exo.entities.Produit;

//La couche service utilise l'interface dao
@Service
public class ProduitServiceImpl implements ProduitServiceInterface{

	@Autowired
	private DaoProduitInterface dao;

	@Override
	@Transactional
	public List<Produit> findAll() {

		return dao.findAll();

	}

	@Override
	@Transactional
	public Produit findById(Long id) {

		return dao.findById(id);
	}

	@Override
	@Transactional
	public Long save(Produit produit) {

		return dao.save(produit);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		dao.deleteById(id);

	}
}
