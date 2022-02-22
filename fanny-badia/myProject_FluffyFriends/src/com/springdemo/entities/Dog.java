package com.springdemo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springdemo.entities.myFluffyFriend;

@Component  // Pour indiquer que la classe est un composant
public class Dog implements myFluffyFriend{
    // Attributs
    private String myDogName;

    // Constructeur sans parametres:
    public Dog(){};

    // constructeur avec parametres:
    @Autowired
    public Dog(String myDogName1) {
        this.myDogName = myDogName1;
    }

    // getters & setters

    public String getMyDogName() {
        return myDogName;
    }

    public void setMyDogName(String myDogName) {
        this.myDogName = myDogName;
    }

    // ré-ecriture des méthodes
    @Override
    public String eating(){
        return "Wohoooo!! a big bone!";
    }

    @Override
    public String havingFun() {
        return "I am running after a deer... arf, so fast  !! ";
    }
}
