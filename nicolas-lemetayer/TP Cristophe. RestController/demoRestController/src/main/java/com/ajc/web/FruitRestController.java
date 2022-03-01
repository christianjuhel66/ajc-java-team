package com.ajc.web;

import com.ajc.entities.Fruit;
import com.ajc.exception.FruitNotCompleteException;
import com.ajc.exception.FruitNotFoundException;
import com.ajc.services.FruitServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/fruits")
public class FruitRestController {
    @Autowired
    private FruitServiceInterface fruitServiceInterface;

    @GetMapping("/list")
    public List<Fruit> listFruits(){
        return fruitServiceInterface.findAll();
    }

    @GetMapping("/fruit/{id}")
    public Fruit getFruit(@PathVariable(name = "id") int fruitId) {
        Fruit fruit = fruitServiceInterface.findAll().get(fruitId - 1);
        return fruit;
    }

    @PostMapping("/fruit")
    public Fruit addFruit(@RequestBody Fruit fruit){
        if (fruit.getNom() == null || fruit.getPrixKg() < 0) {
            throw new FruitNotCompleteException("Requestbody incomplet. Il doit impérativement contenir le nom et le prixKg");
        } else {
            fruit.setId((long) fruitServiceInterface.findAll().size() + 1);
            fruitServiceInterface.save(fruit);
        }
        return fruit;
    }

    @PutMapping("/fruit/{id}")
    public Fruit updateFruit(@PathVariable(name = "id") long fruitId, @RequestBody Fruit fruit){
        if (fruit.getNom() == null || fruit.getPrixKg() < 0) {
            throw new FruitNotCompleteException("Requestbody incomplet. Il doit impérativement contenir le nom et le prixKg");
        } else if (fruitId < 0 || fruitId > fruitServiceInterface.findAll().size()){
            throw new FruitNotFoundException("Fruit non trouvé pour l'id: " + fruitId);
        } else {
            fruit.setId(fruitId);
            fruitServiceInterface.save(fruit);
        }
        return fruit;
    }

    @DeleteMapping("/fruit")
    public String deleteFruit(@RequestBody Fruit fruit){
        if (fruit.getId() == null || fruit.getId() < 0 || fruit.getId() > fruitServiceInterface.findAll().size()) {
            throw new FruitNotFoundException("Fruit non trouvé pour l'id: " + fruit.getId());
        } else {
            fruitServiceInterface.delete(fruit);
        }
        return "fruit delete";
    }
}
