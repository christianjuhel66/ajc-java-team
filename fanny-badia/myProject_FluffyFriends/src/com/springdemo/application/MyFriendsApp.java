package com.springdemo.application;

import com.springdemo.entities.Cat;
import com.springdemo.entities.Dog;

public class MyFriendsApp {
    public static void main(String[] args) {

        // Creation d'un objet chat
        Cat myCuteCat = new Cat();
        myCuteCat.setMyCatName("Myrtille");

        System.out.println("Hello! \n I am Fanfan, I am the luckiest human to have these great friends: \n");
        // Utilisation des méthodes de myFluffyFriend
        System.out.println("Hello! I am " + myCuteCat.getMyCatName() + " !");
        System.out.println(myCuteCat.eating());
        System.out.println(myCuteCat.havingFun());

        Dog myFantasticDog = new Dog();
        myFantasticDog.setMyDogName("O'Malley");

        System.out.println("\n Hi!! I am " + myFantasticDog.getMyDogName() + " :) ");
        System.out.println(myFantasticDog.eating());
        System.out.println(myFantasticDog.havingFun());

        

    }
}
