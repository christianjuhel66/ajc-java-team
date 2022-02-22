package com.application;

import com.dao.DaoCakes;
import com.entities.Cakes;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        // Appel à la session factory pour créer le schema de la BDD ( = création des tables et de leurs champs)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Congrats! It works");

        // Appel de  l'interface Dao, pour pérenniser dans la BDD les objets crées via les methodes:
        DaoCakes daoCakes = context.getBean("daoImpl", DaoCakes.class);
        Cakes lemonCake = new Cakes();
        lemonCake.setCakeName("yummy lemon cake");
        lemonCake.setCakeType("I am a terrific tart");
        lemonCake.setSize(4);
        int id= daoCakes.create(lemonCake);
        System.out.println("Here, the new homemade desserts: " + id + " - " + lemonCake);

    }
}
