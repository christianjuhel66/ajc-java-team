package com.ecole.demo.stagiaire.service;

import java.util.List;

import com.ecole.demo.stagiaire.entity.Employe;

public interface EmployeServiceInterface {
	public List<Employe> findAll();
	
	public int save(Employe e);
	
	public int remove(int id);

}
