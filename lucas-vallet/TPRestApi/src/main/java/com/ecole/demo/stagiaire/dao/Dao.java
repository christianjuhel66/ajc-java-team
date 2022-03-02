package com.ecole.demo.stagiaire.dao;

import java.util.List;

import com.ecole.demo.stagiaire.entity.Employe;
import com.ecole.demo.stagiaire.entity.Entreprise;
import com.ecole.demo.stagiaire.entity.Stagiaire;

public interface Dao {
	public List<Stagiaire> findAllStagiaire();
	public List<Employe>   findAllEmploye();
	
	public Entreprise findEntreprise(int id);
	
	public int save(Stagiaire s);
	public int save(Employe e);
	public int save(Entreprise e);
	
	public int removeEmploye(int id);
	
	
	
	
}
