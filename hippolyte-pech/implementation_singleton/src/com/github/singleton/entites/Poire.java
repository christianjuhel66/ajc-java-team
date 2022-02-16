package com.github.singleton.entites;

public class Poire implements Fruit {
    // instance unique pour la classe pomme, on l'initialise à null et on met sa visibilité à private car elle
    // sera accessible uniquement via la fonction getInstance();
    private static Poire instance = null;

    // Constructeur privé qui ne sera appelé que par la fonction getInstance();
    private Poire(){}


    // Fonction qui va retourner l'unique instance de Pomme et va la créer si elle n'existe pas.
    public static Poire getInstance(){
        if(instance == null){
            instance = new Poire();
        }
        return instance;
    }

    @Override
    public void sePresenter() {
        System.out.println("Bien le bonjour, je suis une pomme !");
    }
}
