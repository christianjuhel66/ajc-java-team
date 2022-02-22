package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String recipeText;

    // getter setter

    public Integer getId() {
        return id;
    }

    public String getRecipeText() {
        return recipeText;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRecipeText(String recipeText) {
        this.recipeText = recipeText;
    }
}
