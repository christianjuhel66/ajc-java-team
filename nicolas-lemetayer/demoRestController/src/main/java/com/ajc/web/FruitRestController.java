package com.ajc.web;

import com.ajc.entities.Fruit;
import com.ajc.services.FruitServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitRestController {
    @Autowired
    private FruitServiceInterface fruitServiceInterface;

    @GetMapping("/listFruits")
    public List<Fruit> listFruits(){
        return fruitServiceInterface.findAll();
    }
}
