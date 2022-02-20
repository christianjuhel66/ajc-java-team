package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @Author: LE METAYER Nicolas
 * Objectif: Demander à un utilisateur un prénom et l'effacer depuis une liste définie de 20 prénoms
 */

public class ExercicePrenoms { //Fonction pour retrier le tableau en mettant, depuis l'incide du prénom trouvé, la valeur i + 1 dans la valeur i
    public static String[] retraiterTableau(String[] tableau, int indice){
        for (int i = indice; i < tableau.length; i++) {
            if(i < tableau.length - 1){
                tableau[i] = tableau[i + 1];
            }
        }
        tableau[tableau.length -1] = null;
        return tableau;
    }

    public static void main(String[] args) {
        String saisieUtilisateur;
        int indice = 0;
        String[] prenoms = {"Mael", "Gwendal", "Mélodie", "Quentin", "Nicolas",
                "Agathe", "Clémence","Sebastien", "Jonathan", "Emilie",
                "Marie", "Anne", "Jean", "André", "Yves", "Glen", "Elodie", "Salomé", "Jeanne", "Eloise"};

        //Demander à l'utilisateur de saisir le prénom à supprimer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            try {
                System.out.println("Saisir un prénom");
                saisieUtilisateur = br.readLine().toString();
                for (String p : prenoms){ //Parcourir le tableau et vérifier si le prénom est dans le tableau
                    if(p.contentEquals(saisieUtilisateur)){
                        //Element trouvé !
                        System.out.println("prénom trouvé: " + p);
                        prenoms = retraiterTableau(prenoms, indice); //Appel à une fonction pour retrier le tableau
                        break;
                    }
                    indice++;
                }
            } catch (IOException e) { //Gestion des exceptions
                e.printStackTrace();
            }
            System.out.println("Elements du tableau");
            for (String p : prenoms){
                System.out.println("prénom: " + p);
            }
        }
    }
}
