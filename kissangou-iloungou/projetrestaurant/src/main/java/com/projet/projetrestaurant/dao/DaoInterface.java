package com.projet.projetrestaurant.dao;

import java.util.List;

import com.projet.projetrestaurant.entities.Employes;
import com.projet.projetrestaurant.entities.Gerant;

public interface DaoInterface {

	// Step 1: renvoyer une liste de la classe Gerant
	public List<Employes> findAll();

	// Step 2: creation de la ma méthode create dans l'interface
	public void create(Gerant gerant);

	public void create(Employes employes);

}
