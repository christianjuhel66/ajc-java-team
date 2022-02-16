package com.github.inposa.pendu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Hippolyte Pech
 * @Title:  Jeu de pendu, invite l'utilisateur à entrer un mot à faire deviner et ensuite le lui faire deviner en le
 *          laissant entrer une lettre à chaque itération jusqu'à ce qu'il trouve le mot ou se trompe 11 fois.
 */
public class Pendu {
    public static void main(String[] args) {

        // ---- Initialisation des variables ----
        int maxCpt = 11;    // Compteur max d'erreur
        int cptErrors = 0;  // Compteur actuel d'erreurs
        //List<Character> charsUsed = new ArrayList<>();

        // Définition et création d'un nouveau scanner (le scanner pointe sur l'entrée standard)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un mot à faire deviner: ");
        // Bloque l'exécution du programme et récupère ce qui est entré par l'utilisateur
        String mot = scanner.next().toUpperCase();

        // Création d'un tableau de char de la même taille que le mot et rempli avec des tirets
        char[] chars = new char[mot.length()];
        Arrays.fill(chars, '_');

        // On boucle jusqu'à ce que l'utilisateur devine le mot ou utilise toutes ses chances
        do {
            // Affiche les lettres qui ont été trouvées
            System.out.println(String.valueOf(chars));

            //System.out.println("Lettres utilisées: \n" + charsUsed.toString());
            System.out.println("Nombre d'erreurs: " + cptErrors);

            System.out.println("Entrez une lettre:");
            char letter = scanner.next().toUpperCase().charAt(0);

            //On boucle sur le mot et on vérifie si le char entré par l'utilisateur est présent
            boolean isCharPresent = false;
            for (int i = 0; i < mot.length(); i++) {
                if (letter == mot.charAt(i)) {
                    chars[i] = letter;
                    isCharPresent = true;
                }
            }
            //charsUsed.add(letter);

            if (!isCharPresent) {
                cptErrors++;
            }
        } while (!mot.equals(String.valueOf(chars)) && cptErrors < 11);

        // On affiche un message en fonction de ce qui a fait sortir de la boucle
        if (cptErrors == 11) {
            System.out.println("Mince ! Tu as perdu !");
        }

        if (mot.equals(String.valueOf(chars))) {
            System.out.println(String.valueOf(chars));
            System.out.println("Bravo tu as gagné !");
        }
    }
}
