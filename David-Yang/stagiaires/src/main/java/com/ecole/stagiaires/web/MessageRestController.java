package com.ecole.stagiaires.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.stagiaires.entities.Stagiaire;
import com.ecole.stagiaires.metiers.ServiceDaoImpl;

@RestController
public class MessageRestController {
	
	@Autowired
	private ServiceDaoImpl ServiceDao;
	private int id = 2;	
	
	@GetMapping("/Home")
	public String HomeTest() {
		return "Welcome to your school";
	}
	
	@GetMapping("/FindAll")
	public List <Stagiaire> findAll() {
		System.out.println("List all students: ");
		return ServiceDao.findAll();
	}
	
	@GetMapping("/Create")
	public void create(Stagiaire stagiaire) {
		ServiceDao.create(stagiaire);
		System.out.println("Creation d'un stagiaire");
	}
	
	@GetMapping("/Read")
	public void read(int id) {
		ServiceDao.read(id);
		System.out.println("Lecture d'un stagiaire");
	}
	
	@GetMapping("/UpdateAdresse")
	public void updateAdresse(int id,String adresse) {
		ServiceDao.updateAdresse(id, adresse);
		System.out.println("Update adress");
	}
	
	@GetMapping("/Delete")
	public void delete(int id) {
		ServiceDao.delete(id);
		System.out.println("Delete student");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
