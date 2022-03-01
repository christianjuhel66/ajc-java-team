package com.ecole.stagiaires.metiers;

import java.util.List;
import com.ecole.stagiaires.entities.Stagiaire;

public interface ServiceDao {

	//Read All
	public List <Stagiaire> findAll();
	//Create
	public void create(Stagiaire stagiaires);
	//Read
	public Stagiaire read(int id);
	//Update
	public void updateAdresse(int id,String adresse);
	//Delete
	public void delete(int id);
}
