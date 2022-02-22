package com.ecole.demo.stagiaire.service;

import java.util.List;
import com.ecole.demo.stagiaire.entity.Stagiaire;

public interface StagiaireServiceInterface {

		public List<Stagiaire> findAll();
		
		public int save(Stagiaire s);
}
