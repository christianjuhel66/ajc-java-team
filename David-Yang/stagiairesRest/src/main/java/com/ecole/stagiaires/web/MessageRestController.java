package com.ecole.stagiaires.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.stagiaires.entities.Stagiaire;
import com.ecole.stagiaires.exceptions.StagiaireNotFoundException;
import com.ecole.stagiaires.metiers.ServiceDaoImpl;

@RestController
@RequestMapping("/School")
public class MessageRestController {
	
	@Autowired
	private ServiceDaoImpl ServiceDao;
	private int id = 2;	
	
	@PostConstruct
	public void loadData() {
		ServiceDao.create(new Stagiaire("david", "Yang","rue de lyon",24));
		ServiceDao.create(new Stagiaire("julien", "Bonnet","rue de paris",24));
		ServiceDao.create(new Stagiaire("liam", "Thuaire","rue de marseille",24));
		ServiceDao.create(new Stagiaire("victor", "Jordan","rue de bordeaux",25));
		System.out.println("Chargement des données originaux");
	}
	
	@GetMapping({"","/home"})
	public String HomeTest() {
		return "Welcome to your school";
	}
	
	@GetMapping("/stagiaires")
	public List <Stagiaire> findAll() {
		System.out.println("List all students.");
		return ServiceDao.findAll();
	}
	
	@PostMapping("/Create")
	public Stagiaire create(@RequestBody Stagiaire stagiaire) {
		ServiceDao.create(stagiaire);
		System.out.println("Creation d'un nouveau stagiaire");
		return stagiaire;
	}
	
	@GetMapping("/Read/{id}")
	public Stagiaire read(@PathVariable(name="id") int id) {
		if (ServiceDao.read(id) == null)
		{
			throw new StagiaireNotFoundException("stagiaire id non trouvé " + id);
		}else{
			System.out.println("Lecture d'un stagiaire");
			Stagiaire stagiaire = ServiceDao.read(id);
			return stagiaire;
		}
	}
	
	@PutMapping("/UpdateAdresse/{id}")
	public String updateAdresse(@PathVariable(name="id") int id, @RequestBody String adress) {
		if (ServiceDao.read(id) == null)
		{
			throw new StagiaireNotFoundException("stagiaire id non trouvé " + id);
		}else {
			ServiceDao.updateAdresse(id, adress);
		}
		return "Le stagiaire : " + id + " a vu son adresse update";
	}
	
	@DeleteMapping("/Delete/{id}")
	public String delete(@PathVariable(name="id") int id) {
		ServiceDao.delete(id);
		return "Delete stagiaire " + id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
