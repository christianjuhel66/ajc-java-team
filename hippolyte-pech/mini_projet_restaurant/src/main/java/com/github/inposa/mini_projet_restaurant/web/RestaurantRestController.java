package com.github.inposa.mini_projet_restaurant.web;

import com.github.inposa.mini_projet_restaurant.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RestaurantRestController {

    @Autowired
    private DAO dao;

    @GetMapping("/list")
    public String getAllRestaurant(){
        return dao.findAll().toString();
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        return dao.findById(id).toString();
    }
}
