package com.entities;

import javax.persistence.*;

@Entity
public class Cakes {
    // attributs
    @Id
    @GeneratedValue
    private int id;
    private String cakeName;
    private String cakeType;
    private int size;


    @OneToOne(cascade = CascadeType.ALL)     //creation d'abord de la recipe avant la création du cake
    private Recipe recipe; // la classe Cake contient un objet de la classe recipe
    // le cake désigne avec FK une recipe par son id


    // constructeur par défaut:
    public Cakes(){}

    // constructeur appelé par AppMain:
    public Cakes(int id, String cakeName, String cakeType, int size){
        this.id = id;
        this.cakeName = cakeName;
        this.cakeType = cakeType;
        this.size = size;
    }

    // getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCakeName() {
        return cakeName;
    }
    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getCakeType() {
        return cakeType;
    }
    public void setCakeType(String cakeType) {
        this.cakeType = cakeType;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


// methods

}
