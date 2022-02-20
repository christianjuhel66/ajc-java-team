package com.ecole.demo.stagiaire.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.demo.stagiaire.dao.Dao;
import com.ecole.demo.stagiaire.entity.Entreprise;

@Service
public class EntrepriseServiceImpl implements EntrepriseServiceInterface{
	
	 @Autowired
	 private Dao dao;
	 
	@Override
	public Entreprise findById(int id) {
		return dao.findEntreprise(id);
	}

	@Override
	public int save(Entreprise e) {
		return dao.save(e);
	}
	

}
