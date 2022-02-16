package com.collections;

import java.util.ArrayList;

/**
 * @Author: LE METAYER Nicolas
 */
 
public class Execution {
    public static void main(String[] args) {
        //Déclaration des variables
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //Ajouter tous les nombres de 1 jusqu'à 100 dans la liste
        for (int i = 1; i <= 100; i++){
            list1.add(i);
        }

        //Afficher tous les éléments de la liste
        System.out.println(list1.toString());

        //Retirer tous les multiples de 5 de la liste.
        list1.removeIf(val -> val % 5 == 0);

        //Afficher tous les éléments de la liste
        System.out.println(list1.toString());
    }
}
