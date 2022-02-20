package com.ecole.demo.stagiaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}