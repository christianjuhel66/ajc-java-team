package com.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entity.Employe;
import com.restaurant.service.EmployeService;

@RestController
@RequestMapping("/api/employes")
public class EmployeController {

	private EmployeService employeservice;

	public EmployeController(EmployeService employeservice) {
		this.employeservice = employeservice;
	}

	// créer une méthode simple HTTP avec un GetMapping
	@GetMapping("/employe")
	public Employe getEmploye() {
		return new Employe("Bart", "Serveur", "06.12.54.55.13");
	}

	// créer une méthode List
	@GetMapping("/listemploye")
	public List<Employe> getEmployes() {
		List<Employe> employes = new ArrayList<>();
		employes.add(new Employe("Bart", "Serveur", "06.12.54.55.13"));
		employes.add(new Employe("Lisa", "Serveuse", "07.25.24.36.50"));
		employes.add(new Employe("Maggie", "Manager", "06.07.10.20.25"));

		return employes;
	}

	// créer une méthode avec l'annotation @PathVariable
	@GetMapping("/employe/{prenom}")
	public Employe employePathVariable(@PathVariable("prenom") String prenom, String metier, String portable) {
		return new Employe(prenom, metier, portable);
	}

	// créer un rest API pour gérer les paramétres requêtes
	// http://localhost:8080/employe/query?prenom=Bart
	@GetMapping("/employe/query")
	public Employe employeQueryParam(@RequestParam(name = "prenom") String prenom, String metier, String portable) {
		return new Employe(prenom, metier, portable);
	}

	/*-----------------------------------------------------------------------*/

	// créer POST REST API avec ResponseEntity
	@PostMapping()
	public ResponseEntity<Employe> saveEmploye(@RequestBody Employe employe) {
		return new ResponseEntity<Employe>(employeservice.saveEmploye(employe), HttpStatus.CREATED);
	}

	// créer GET REST API pour la liste des employes
	@GetMapping()
	public List<Employe> getAllEmployes() {
		return employeservice.getAllEmployes();
	}

	// créer GET REST API recherche par id
	// http://localhost:8080/api/employes/1
	@GetMapping("{id}")
	public ResponseEntity<Employe> getEmployeId(@PathVariable("id") long id) {
		return new ResponseEntity<Employe>(employeservice.getEmployeById(id), HttpStatus.OK);

	}

	// créer UPDATE REST API
	@PutMapping("{id}")
	// http://localhost:8080/api/employes/1
	public ResponseEntity<Employe> updateEmploye(@PathVariable("id") long id, @RequestBody Employe employe) {
		return new ResponseEntity<Employe>(employeservice.udpateEmploye(employe, id), HttpStatus.OK);
	}
}
