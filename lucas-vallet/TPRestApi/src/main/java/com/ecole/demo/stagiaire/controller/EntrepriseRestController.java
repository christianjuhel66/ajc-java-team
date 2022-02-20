package com.ecole.demo.stagiaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.ecole.demo.stagiaire.entity.Entreprise;
import com.ecole.demo.stagiaire.service.EntrepriseServiceInterface;

@RestController
public class EntrepriseRestController {
	
	@Autowired
	private EntrepriseServiceInterface entrepriseServiceInterface;
	
	 @RequestMapping(value = "/entreprise/{id}", method = GET)
	 public Entreprise getEntreprise(@PathVariable("id") int id) {
	        return entrepriseServiceInterface.findById(id);
	    }

}
