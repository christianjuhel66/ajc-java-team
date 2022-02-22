package com.ecole.demo.stagiaire.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.demo.stagiaire.dao.Dao;
import com.ecole.demo.stagiaire.entity.Employe;

@Service
public class EmployeServiceImpl implements EmployeServiceInterface {
	
	@Autowired
    private Dao dao;
	
	@Override
	@Transactional
	public List<Employe> findAll() {
		 return dao.findAllEmploye();
	}

	@Override
	public int save(Employe e) {
		return dao.save(e);
	}

}
