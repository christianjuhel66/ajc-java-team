package com.ecole.stagiaires.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecole.stagiaires.dao.DaoImpl;
import com.ecole.stagiaires.entities.Stagiaire;

@Service
public class ServiceDaoImpl implements ServiceDao{

	@Autowired
	private DaoImpl dao; 
	
	@Override 	@Transactional
	public List <Stagiaire> findAll() {
		return dao.findAll();
	}
	
	@Override 	@Transactional
	public void create(Stagiaire stagiaire) {
		dao.create(stagiaire);
	}

	@Override 	@Transactional
	public Stagiaire read(int id) {
		return dao.read(id);
	}

	@Override 	@Transactional
	public void updateAdresse(int id, String adresse) {
		dao.updateAdresse(id, adresse);
	}
	
	@Override 	@Transactional
	public void delete(int id) {
		dao.delete(id);
	}
}
