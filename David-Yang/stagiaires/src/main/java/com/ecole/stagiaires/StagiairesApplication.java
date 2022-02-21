package com.ecole.stagiaires;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecole.stagiaires.dao.Dao;
import com.ecole.stagiaires.dao.DaoImpl;
import com.ecole.stagiaires.entities.Stagiaire;
import com.ecole.stagiaires.metiers.ServiceDaoImpl;

@SpringBootApplication
public class StagiairesApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(StagiairesApplication.class, args);
	}
	
	@Autowired
	private ServiceDaoImpl dao;

	@Override
	public void run(String... args) throws Exception {
		//VOIR LES DIFFERENTS TESTS 
		dao.create(new Stagiaire("david", "Yang","rue de lyon",24));
		dao.create(new Stagiaire("julien", "Bonnet","rue de paris",24));
		dao.create(new Stagiaire("liam", "thuraire","rue de marseille",24));

		List <Stagiaire> myDatabase	= dao.findAll();	
		int id = 3;
		System.out.println(dao.read(id).toString());
		dao.updateAdresse(id,"Vincennes");
		dao.delete(id);		
	}

}

