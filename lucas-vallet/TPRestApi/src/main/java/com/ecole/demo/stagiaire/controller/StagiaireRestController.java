package com.ecole.demo.stagiaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.demo.stagiaire.entity.Stagiaire;
import com.ecole.demo.stagiaire.service.StagiaireServiceInterface;

@RestController
public class StagiaireRestController {
	 
	@Autowired
	  private StagiaireServiceInterface stagiaireServiceInterface;

	  @GetMapping("/listStagiaires")
	   public List<Stagiaire> listStagiaires(){
	        return stagiaireServiceInterface.findAll();
	   }

}
