package com.formation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entity.Cours;
import com.formation.metier.CoursServiceInterface;

@RestController
public class CoursRestController {

	@Autowired
	private CoursServiceInterface coursService;

////	@Autowired
//	public CoursRestController(CoursServiceInterface CoursService) {
//		this.CoursService = CoursService;
//	}
//
//	@Autowired
//	public void setCoursService(CoursServiceInterface CoursService) {
//		this.CoursService = CoursService;
//	}
//
	@GetMapping("/premiertest")
	public String premierTest() {
		return "je marche bien";
	}

	@GetMapping("/appelFindAll")
	public List<Cours> findAll() {
		System.out.println("coucou je passe par là");
		return coursService.findAll();
	}

	@GetMapping("/create")
	public Cours create() {
		System.out.println("coucou je passe par create endpoint");
		Cours c = new Cours("SQL", 4);
		coursService.save(c);
		return c;
	}

	@GetMapping("/findById")
	public Cours findId() {
		System.out.println("cocucou je passe par findById endpoint");
		int id = 1;
		return coursService.findById(id);

	}

	@GetMapping("/update")
	public Cours update() {
		System.out.println("cocucou je passe par   update endpoint");
		Cours c = coursService.findById(2);
		c.setNom("Agile");
		c.setCoef(1);
		coursService.save(c);
		return c;
	}

	@GetMapping("/delete")
	public void delete() {
		System.out.println("cocucou je passe par   delete dendpoint");

		coursService.deleteById(3);
	}

}
