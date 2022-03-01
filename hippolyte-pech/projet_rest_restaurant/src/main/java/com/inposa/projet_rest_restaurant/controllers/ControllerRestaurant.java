package com.inposa.projet_rest_restaurant.controllers;

import com.inposa.projet_rest_restaurant.crud_repo.ICrudRestaurant;
import com.inposa.projet_rest_restaurant.entities.Restaurant;
import com.inposa.projet_rest_restaurant.exceptions.RestaurantNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/restaurant")
public class ControllerRestaurant {

    @Autowired
    ICrudRestaurant crudRestaurant;

    @GetMapping({"/all", ""})
    public Iterable<Restaurant> getAllRestaurants() {
        return this.crudRestaurant.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Integer id) throws RestaurantNotFoundException {
        Optional<Restaurant> restaurant = this.crudRestaurant.findById(id);
        if (restaurant.isEmpty()) {
            throw new RestaurantNotFoundException("Le restaurant d'id " + id + " n'existe pas !");
        }

        return restaurant;
    }

    @PostMapping("/create")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return this.crudRestaurant.save(restaurant);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRestaurant(@PathVariable Integer id) throws RestaurantNotFoundException {
        if (this.crudRestaurant.findById(id).isEmpty()) {
            throw new RestaurantNotFoundException("Le restaurant d'id " + id + " n'existe pas !");
        }
        crudRestaurant.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Le restaurant d'id " + id + " a bien été supprimé !");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateRestaurant(@PathVariable Integer id, @RequestBody Restaurant restaurant) throws RestaurantNotFoundException {
        if(!restaurant.getId().equals(id)){
            //TODO on renvoie un badRequest au lieu d'un not found
            throw new RestaurantNotFoundException("L'id du json et de l'url ne correspondent pas !");
        }
        if(this.crudRestaurant.findById(id).isEmpty()){
            throw new RestaurantNotFoundException("Le restaurant d'id " + id + " n'existe pas !");
        }

        crudRestaurant.save(restaurant);
        return ResponseEntity.status(HttpStatus.OK).body("Le restaurant d'id " + id + " a bien été modifié !");
    }
}
