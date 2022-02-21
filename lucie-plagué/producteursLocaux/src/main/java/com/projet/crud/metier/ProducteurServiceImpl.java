package com.projet.crud.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.crud.Entity.Producteur;
import com.projet.crud.dao.DaoInterface;

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
	public Producteur findById(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public Long save(Producteur producteur) {
		return dao.save(producteur);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		dao.deleteById(id);
	}

}
