package com.restaurant.service;

import java.util.List;

import com.restaurant.entity.Employe;

public interface EmployeService {
	Employe saveEmploye(Employe employe);

	List<Employe> getAllEmployes();

	Employe getEmployeById(long id);

	Employe udpateEmploye(Employe employe, long id);

}
