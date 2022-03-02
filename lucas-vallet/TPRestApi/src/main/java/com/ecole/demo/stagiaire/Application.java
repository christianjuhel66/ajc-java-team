package com.ecole.demo.stagiaire;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecole.demo.stagiaire.entity.Employe;
import com.ecole.demo.stagiaire.entity.Stagiaire;
import com.ecole.demo.stagiaire.entity.Entreprise;
import com.ecole.demo.stagiaire.service.EmployeServiceInterface;
import com.ecole.demo.stagiaire.service.EntrepriseServiceInterface;
import com.ecole.demo.stagiaire.service.StagiaireServiceInterface;

@SpringBootApplication
public class Application /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/*
	@Autowired
	private StagiaireServiceInterface stagiaires;

	@Autowired
	private EmployeServiceInterface employes;

	@Autowired
	private EntrepriseServiceInterface entreprises;

	@Override
	public void run(String... args) throws Exception {
		Employe emp1 = new Employe("Valliant", "Jean", 33, "34 Rue des Autos");
		Employe emp2 = new Employe("Vog", "Bo", 2, "App 5454");
		Employe emp3 = new Employe("Ulalal", "Gor", 345, "Space Station Xyz");
		employes.save(emp1);
		employes.save(emp2);
		employes.save(emp3);
		employes.findAll();

		Stagiaire stag = new Stagiaire();
		stagiaires.save(stag);
		stagiaires.save(new Stagiaire("GGG","Beru", 12, "Valence"));
		stagiaires.findAll();

		List<Employe> listEmploye = new ArrayList();
		listEmploye.add(emp1);
		listEmploye.add(emp2);

		Entreprise entreprise = new Entreprise();
		entreprise.setEmployes(listEmploye);
		entreprises.save(entreprise);
	} */

}
