package com.tp.formation.web;

import com.tp.formation.entity.Cours;
import com.tp.formation.metier.CoursServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursRestController {

    @Autowired
    private CoursServiceInterface coursServiceInterface;

    //CRUD
    @GetMapping("/create")
    public Cours create(){
        System.out.println("Je crée");
        Cours cours = new Cours("SQL", 4);
        coursServiceInterface.save(cours);
        return cours;
    }
    @GetMapping("/findById")
    public Cours findId(){
        System.out.println("Je lis");
        int id = 1;
        return coursServiceInterface.findById(id);
    }
    @GetMapping("/update")
    public Cours update(){
        System.out.println("J'update");
        Cours cours = coursServiceInterface.findById(2);
        cours.setNom("Angular");
        cours.setCoef(6);
        coursServiceInterface.save(cours);
        return cours;
    }
    @GetMapping("/delete")
    public void delete(){
        System.out.println("Je delete");
        coursServiceInterface.deleteById(3);
    }
}
