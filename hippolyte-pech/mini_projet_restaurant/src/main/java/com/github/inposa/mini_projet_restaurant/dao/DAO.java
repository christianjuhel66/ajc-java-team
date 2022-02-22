package com.github.inposa.mini_projet_restaurant.dao;

import com.github.inposa.mini_projet_restaurant.entities.Restaurant;

import java.util.List;

public interface DAO {
    public List<Restaurant> findAll();
    public Restaurant findById(int id);


}
