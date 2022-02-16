package com.github.singleton;

import com.github.singleton.entites.Pomme;

public class App {
    public static void main(String[] args) {
        System.out.println("Implémentation du design pattern Singleton, ce pattern définit une classe qui ne être" +
                " instanciée qu'une seule fois et dont l'instance peut être récupéré à tout instant.");

        Pomme instancePomme1 = Pomme.getInstance();

        System.out.println("Réutilisation de la méthode getInstance pour créer \"une seconde instance\": ");
        Pomme instancePomme2 = Pomme.getInstance();

        System.out.println("Println de la variable instancePomme1 "+instancePomme1.toString());
        System.out.println("Println de la variable instancePomme2 "+instancePomme2.toString());

        if(instancePomme1 == instancePomme2){
            System.out.println("Les références récupéré avec getInstance() sont les mêmes, l'exercice est réussi !\nSUCCESS");
        }
        else{
            System.out.println("Les deux références récupéré avec getInstance() NE SONT PAS LES MÊMES");
        }
    }
}
