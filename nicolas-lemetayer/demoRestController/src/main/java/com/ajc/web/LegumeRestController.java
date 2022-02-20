package com.ajc.web;

import com.ajc.entities.Fruit;
import com.ajc.entities.Legume;
import com.ajc.services.FruitServiceInterface;
import com.ajc.services.LegumeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LegumeRestController {
    @Autowired
    private LegumeServiceInterface legumeServiceInterface;

    @GetMapping("/listLegumes")
    public List<Legume> listLegumes(){
        return legumeServiceInterface.findAll();
    }
}
