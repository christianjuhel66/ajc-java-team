package com.application;

import com.dao.DaoCakes;
import com.entities.Cakes;
import com.entities.Recipe;
import com.entities.Teatime;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreaCakes {
    public static void main(String[] args) {
        // Appel à la session factory pour créer le schema de la BDD ( = création des tables et de leurs champs)
        // instancie le contexet et recup de Dao1 crée
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Congrats! It works too");

        // Appel de  l'interface Dao, pour pérenniser dans la BDD les entités crées:
        DaoCakes daoCakes = context.getBean("daoCakesImpl", DaoCakes.class);            // recuperation de l'instance dao depuis le context crée


        // Test01: création d'un tuple pour la table Cake:
        Cakes lemonCake = new Cakes();
        lemonCake.setCakeName("yummy lemon cake");
        lemonCake.setCakeType("I am a terrific tart");
        lemonCake.setSize(4);

        // création d'un tuple pour la table Recipe
        Recipe recipeTart = new Recipe();
        recipeTart.setRecipeText("my favourite recipe");

        // inclusion de recipeTart ds lemonCake
        lemonCake.setRecipe(recipeTart);

        // persite le nouveau cake ET sa recipe:
        daoCakes.create(lemonCake);
        System.out.println(lemonCake);
        daoCakes.delete(lemonCake);


    }
}
