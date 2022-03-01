package com.inposa.projet_rest_restaurant.crud_repo;

import com.inposa.projet_rest_restaurant.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface ICrudRestaurant extends CrudRepository<Restaurant, Integer> {
}
