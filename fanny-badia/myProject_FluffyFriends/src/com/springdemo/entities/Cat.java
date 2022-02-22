package com.springdemo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springdemo.entities.myFluffyFriend;

@Component
public class Cat implements myFluffyFriend {
    // Attributs
    private String myCatName;

    // Constructeur sans parametres:
    public Cat(){}

    // Constructeur avec parametres:
    @Autowired
    public Cat(String myCatName1) {
        this.myCatName = myCatName1;
    }


    //getters & setters
    public String getMyCatName() {
        return myCatName;
    }
    public void setMyCatName(String myCatName) {
        this.myCatName = myCatName;
    }


    // méthodes
    @Override
    public String eating() {
        return "Yumm! I am eating fish food";
    }

    @Override
    public String havingFun(){
        return "I am chasing a paperball";
    }




}
