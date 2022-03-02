package com.restaurant.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Employe;
import com.restaurant.exception.EmployeNotFoundException;
import com.restaurant.repository.EmployeRepository;
import com.restaurant.service.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService {

	private EmployeRepository employeRepository;

	public EmployeServiceImpl(EmployeRepository employeRepository) {
		this.employeRepository = employeRepository;
	}

	@Override
	public Employe saveEmploye(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public List<Employe> getAllEmployes() {
		return employeRepository.findAll();
	}

	@Override
	public Employe getEmployeById(long id) {
		Optional<Employe> employe = employeRepository.findById(id);

		if (employe.isPresent()) {
			return employe.get();
		} else {
			throw new EmployeNotFoundException("Employe id non trouvé - " + id);
		}

	}

	@Override
	public Employe udpateEmploye(Employe employe, long id) {

		// controler si un employe avec un id existe
		Employe existingEmploye = employeRepository.findById(id)
				.orElseThrow(() -> new EmployeNotFoundException("Employe id n'existe pas - " + id));

		existingEmploye.setPrenom(employe.getPrenom());
		existingEmploye.setMetier(employe.getMetier());
		existingEmploye.setPortable(employe.getPortable());

		// sauvegarder l'employe existant
		employeRepository.save(existingEmploye);

		return existingEmploye;
	}
}