package com.spring.demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: LE METAYER Nicolas
 */
 
public class ExercicePendu {
    public static void main(String[] args) {
        //Déclaration des variables
        int cptMax = 10;
        int cptErrors = 0;
        String motPendu;
        boolean chaineTrouve = false;
        char[] chaine;

        //Mot à faire deviner par l'utilisateur
        Scanner scan = new Scanner(System.in);
        System.out.println("Mot à faire deviner: ");
        motPendu = scan.next().toUpperCase();

        //Initialiser la chaîne vide
        chaine = new char[motPendu.length()];
        Arrays.fill(chaine, '_');

        do {
            System.out.println(String.valueOf(chaine));
            System.out.println("Compteur erreur: " + cptErrors); // to delete

            System.out.println("Lettre à deviner:");
            char lettre = scan.next().toUpperCase().charAt(0);

            //Remettre à zéro à chaque fois l'indicateur de char trouvé
            chaineTrouve = false;
            //Vérifier si la lettre saisie par l'utilisateur est dans le mot
            for (int i = 0; i < motPendu.length(); i++) {
                if (lettre == motPendu.charAt(i)) {
                    chaine[i] = lettre;
                    chaineTrouve = true;
                }
            }

            //Si le caractère n'est pas présent dans le mot pendu, on augmente le compteur d'erreurs.
            if (!chaineTrouve) {
                cptErrors++;
            }
        } while (!motPendu.equals(String.valueOf(chaine)) && cptErrors <= 10); //Tant que le mot n'est pas trouvé ou le compteur vide

        if (cptErrors >= 10) {
            System.out.println("C'est perdu !");
        }

        if (motPendu.equals(String.valueOf(chaine))) {
            System.out.println(String.valueOf(chaine));
            System.out.println("C'est gagné !");
        }
    }
}
