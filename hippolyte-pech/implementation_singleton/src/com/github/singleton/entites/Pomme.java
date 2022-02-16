package com.github.singleton.entites;

public class Pomme implements Fruit {

    // instance unique pour la classe pomme, on l'initialise à null et on met sa visibilité à private car elle
    // sera accessible uniquement via la fonction getInstance();
    private static Pomme instance = null;

    // Constructeur privé qui ne sera appelé que par la fonction getInstance();
    private Pomme(){}


    // Fonction qui va retourner l'unique instance de Pomme et va la créer si elle n'existe pas.
    public static Pomme getInstance(){
        if(instance == null){
            instance = new Pomme();
        }
        return instance;
    }

    @Override
    public void sePresenter() {
        System.out.println("Bien le bonjour, je suis une pomme !");
    }
}
