package com.ecole.demo.stagiaire.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.demo.stagiaire.dao.Dao;
import com.ecole.demo.stagiaire.entity.Stagiaire;

@Service
public class StagiaireServiceImpl implements StagiaireServiceInterface{
	
	@Autowired
    private Dao dao;
	
	@Override
	@Transactional
	public List<Stagiaire> findAll() {
		 return dao.findAllStagiaire();
	}

	@Override
	public int save(Stagiaire s) {
		return dao.save(s);
	}

}
