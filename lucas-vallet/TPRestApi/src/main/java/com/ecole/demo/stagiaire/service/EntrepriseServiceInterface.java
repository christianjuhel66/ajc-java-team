package com.ecole.demo.stagiaire.service;

import java.util.List;

import com.ecole.demo.stagiaire.entity.Entreprise;

public interface EntrepriseServiceInterface {
	public Entreprise findById(int id);
	
	public int save(Entreprise e);

}
