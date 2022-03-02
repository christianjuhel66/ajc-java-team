package com.ecole.demo.stagiaire.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.demo.stagiaire.exception.EmployeNotFoundException;
import com.ecole.demo.stagiaire.entity.Employe;
import com.ecole.demo.stagiaire.service.EmployeServiceInterface;


@RestController
public class EmployeRestController {
	 
	@Autowired
	 private EmployeServiceInterface employeServiceInterface;

	  @GetMapping("/listEmployes")
	  public List<Employe> listEmployes(){
	        return employeServiceInterface.findAll();
	  }
	  
	// api/employes/{id}
		// {id} : path variable
		// Definir un end point "/employes/{id} qui retourne un employe
		@GetMapping("/employes/{id}")
		public Employe getEmploye(
				@PathVariable(name="id") int employeId) {

			// verifier que l'id recherché est conforme au nombre d'employé
			if(employeId > employeServiceInterface.findAll().size() || employeId < 0 ) {
				throw new EmployeNotFoundException("Employe id non trouvé - " + employeId);
			}
				
			return employeServiceInterface.findAll().get(employeId - 1);
		}
		
		
		// définir un end point "/employes" qui sauvegarde un nouvel employe
		@PostMapping("/employes")
		public Employe addEmploye(@RequestBody Employe employe) {
			
			employe.setId(employeServiceInterface.findAll().size() + 1);
			employeServiceInterface.save(employe);
			
			return employe;
			
		}
		
	/*	@PutMapping("/employes/{id}")
		public Employe updateEmploye(@RequestBody Employe employe) {
			int id = employe.getId();
			employes.set(id-1, employe);
			
			return employe;
			
		} */

	
		@PutMapping("/employes/{id}")
		public Employe updateEmploye(@PathVariable(name = "id") int employeId, @RequestBody Employe employe) {
			
			// verifier que l'id recherché est conforme au nombre d'employé
			if(employeId > employeServiceInterface.findAll().size() || employeId < 0 ) {
				throw new EmployeNotFoundException("Employe id non trouvé - " + employeId);
			}
			
			employe.setId(employeId);
			employeServiceInterface.save(employe);
			
			return employe;
			
		}
		
		
		@DeleteMapping("/employes/{id}")
		public void deleteEmployeById(@PathVariable(name="id") int employeId) {
			employeServiceInterface.remove(employeId);
		}

}