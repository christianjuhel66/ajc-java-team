package com.tp.formation.web;

import com.tp.formation.entity.Cours;
import com.tp.formation.exception.CoursNotFoundException;
import com.tp.formation.metier.CoursServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoursRestController {

    @Autowired
    private CoursServiceInterface coursServiceInterface;

    // read
    @GetMapping("/cours")
    public List<Cours> getCours() {
        return coursServiceInterface.findAll();
    }

    @GetMapping("cours/{id}")
    public Cours getCours(@PathVariable(name="id") int coursId) {
        if(coursId >= coursServiceInterface.findAll().size() || coursId < 0) {
            throw new CoursNotFoundException("Le cours n'a pas été trouvé - " + coursId);
        }
        return coursServiceInterface.findById(coursId);
    }

    // create
    @PostMapping("/cours")
    public Cours addCours(@RequestBody Cours cours) {
        coursServiceInterface.save(cours);

        return cours;
    }

    // update
    @PutMapping("/cours")
    public Cours updateCours(@RequestBody Cours cours) {
        coursServiceInterface.save(cours);

        return cours;
    }

    // delete
    @DeleteMapping("/cours/{id}")
    public void deleteCoursById(@PathVariable(name="id") int coursId) {
        if(coursId >= coursServiceInterface.findAll().size() || coursId < 0) {
            throw new CoursNotFoundException("Le cours n'a pas été trouvé - " + coursId);
        }
        else {
            coursServiceInterface.deleteById(coursId);
        }
    }
}
