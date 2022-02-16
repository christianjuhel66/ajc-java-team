package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: LE METAYER Nicolas
 */
public class ExerciceDoublon {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int cpt = 0;

        List<String> liste = new ArrayList<String>();

        System.out.println("Saisissez le nombre de mots à inscrire dans la liste");
        int nbElements = Integer.parseInt(a.nextLine());
        do {
            System.out.println("Saisissez un mot");
            String chaine = a.nextLine();
            if(!liste.contains(chaine)){
                liste.add(chaine);
                cpt++;
            }
            System.out.println(liste.toString());
        } while (cpt < nbElements);
    }
}
