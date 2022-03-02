package com.formation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entity.Cours;
import com.formation.exception.CoursNotFoundException;
import com.formation.metier.CoursServiceInterface;

@RestController
@RequestMapping("/api")
public class CoursRestController {

	@Autowired
	private CoursServiceInterface coursService;

	@GetMapping("/cours")
	public List<Cours> getCours() {
		return coursService.findAll();
	}

	@GetMapping("/cours/{id}")
	public Cours getCours(@PathVariable(name = "id") int coursId) {
		if (coursId >= coursService.findAll().size() || coursId < 0) {
			throw new CoursNotFoundException("Cours id non trouve - " + coursId);
		}
		return coursService.findById(coursId);
		// return coursService.findById(coursId);
	}

	@PostMapping("/cours")
	public Cours addCours(@RequestBody Cours cours) {
		coursService.save(cours);
		return cours;
	}

	@PutMapping("/cours/{id}")
	public Cours updateCours(@RequestBody Cours cours) {
		coursService.save(cours);
		return cours;
	}

	@DeleteMapping("/cours/{id}")
	public void deleteCours(@PathVariable(name = "id") int coursId) {
		if (coursId >= coursService.findAll().size() || coursId < 0) {
			throw new CoursNotFoundException("Cours id non trouve - " + coursId);
		} else {
			coursService.deleteById(coursId);
		}

	}

	/*
	 * @GetMapping("/premiertest") public String premierTest() { return
	 * "je marche bien"; }
	 * 
	 * @GetMapping("/appelFindAll") public List<Cours> findAll() {
	 * System.out.println("coucou je passe par là"); return coursService.findAll();
	 * }
	 * 
	 * @GetMapping("/create") public Cours create() {
	 * System.out.println("coucou je passe par create endpoint"); Cours c = new
	 * Cours("SQL", 4); coursService.save(c); return c; }
	 * 
	 * @GetMapping("/findById") public Cours findId() {
	 * System.out.println("coucou je passe par findById endpoint"); int id = 1;
	 * return coursService.findById(id);
	 * 
	 * }
	 * 
	 * @GetMapping("/update") public Cours update() {
	 * System.out.println("coucou je passe par update endpoint"); Cours c =
	 * coursService.findById(2); c.setNom("Agile"); c.setCoef(1);
	 * coursService.save(c); return c; }
	 * 
	 * @GetMapping("/delete") public void delete() {
	 * System.out.println("coucou je passe par delete endpoint");
	 * 
	 * coursService.deleteById(3); }
	 */

}
