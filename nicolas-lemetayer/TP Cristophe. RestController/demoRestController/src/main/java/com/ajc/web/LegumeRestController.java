package com.ajc.web;

import com.ajc.entities.Fruit;
import com.ajc.entities.Legume;
import com.ajc.exception.FruitNotCompleteException;
import com.ajc.exception.FruitNotFoundException;
import com.ajc.exception.LegumeNotCompleteException;
import com.ajc.exception.LegumeNotFoundException;
import com.ajc.services.FruitServiceInterface;
import com.ajc.services.LegumeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/legumes")
public class LegumeRestController {
    @Autowired
    private LegumeServiceInterface legumeServiceInterface;

    @GetMapping("/list")
    public List<Legume> listLegumes(){
        return legumeServiceInterface.findAll();
    }

    @GetMapping("/legume/{id}")
    public Legume getLegume(@PathVariable(name = "id") int legumeId) {
        Legume legume = legumeServiceInterface.findAll().get(legumeId - 1);
        return legume;
    }

    @PostMapping("/legume")
    public Legume addLegume(@RequestBody Legume legume){
        if (legume.getNom() == null || legume.getPrixKg() < 0) {
            throw new LegumeNotCompleteException("Requestbody incomplet. Il doit impérativement contenir le nom et le prixKg");
        } else {
            legume.setId((long) legumeServiceInterface.findAll().size() + 1);
            legumeServiceInterface.save(legume);
        }
        return legume;
    }

    @PutMapping("/legume/{id}")
    public Legume updateLegume(@PathVariable(name = "id") long legumeId, @RequestBody Legume legume){
        if (legume.getNom() == null || legume.getPrixKg() < 0) {
            throw new LegumeNotCompleteException("Requestbody incomplet. Il doit impérativement contenir le nom et le prixKg");
        } else if (legumeId < 0 || legumeId > legumeServiceInterface.findAll().size()){
            throw new LegumeNotFoundException("Légume non trouvé pour l'id: " + legumeId);
        } else {
            legume.setId(legumeId);
            legumeServiceInterface.save(legume);
        }
        return legume;
    }

    @DeleteMapping("/legume")
    public String deleteLegume(@RequestBody Legume legume){
        if (legume.getId() == null || legume.getId() < 0 || legume.getId() > legumeServiceInterface.findAll().size()) {
            throw new LegumeNotFoundException("Legume non trouvé pour l'id: " + legume.getId());
        } else {
            legumeServiceInterface.delete(legume);
        }
        return "legume delete";
    }
}
