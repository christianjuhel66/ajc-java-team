package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercice6 {

	public static void main(String[] args) {
		/*
		 * Créez le programme qui tri un tableau d'int en ordre décroissant
		 * 
		 * convertir un tableau de int en une liste d'integer 
		 * convertir une liste d'integer en un flux d'integer 
		 * Trier le flux par ordre décroissant 
		 * Puis reconvertir en un tableau
		 */
		
		// Initialise un tableau avec 10 valeurs comprises entre 1 et 100
		int[] tabInt = new int[10];
		tabInt = fillingTab(1, 101, 10, tabInt);
		printTabValues(tabInt);
		
		// Tri par sélection du tableau
		triSelection(tabInt);
		printTabValues(tabInt);
		
		// Convertir un tableau de int en une liste d'integer 
		List<Integer> myListIntegers = new ArrayList<Integer>();
		for (int i = 0; i < tabInt.length; i++) {
			myListIntegers.add(tabInt[i]);
		}
		System.out.println(myListIntegers);
		

	}
	
	// Remplissage d'un tableau avec des nombres aléatoires
	public static int[] fillingTab(int min, int max, int size, int[] tab) {
		for (int i = 0; i < 10; i++) {
			tab[i] = (int) (Math.random() * (max - min)) + min;
		}
		return tab;
	}
	
	// Affiche en ligne les valeurs du tableau passé en argument
	public static void printTabValues(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.print("\n");
	}
	
	// Fait un tri par sélection du tableau passé en argument
	public static int[] triSelection(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++){
             int tmp_i = i;  
             for (int j = i + 1; j < tab.length; j++){
                  if (tab[j] > tab[tmp_i]){ 
                       tmp_i = j;
                  }
             }

             int max = tab[tmp_i];
             tab[tmp_i] = tab[i]; 
             tab[i] = max;
        }
		return tab;
	}

}
