package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercice2 {
	
	public static void main(String[] args) {
		
		// Initialiser 2 tableaux de 10 éléments de type entier
		int[] tabInt1 = new int[10];
		int[] tabInt2 = new int[10];
		
		// Definir un min et un max pour générer les valeurs aléatoires
		int min = 1;
		int max = 11;
		
		// Affecter valeurs aléatoires de 1 à 10
		for(int i = 0; i < 10; i++) {
			tabInt1[i] = (int) (Math.random()*(max-min)) + min;
			tabInt2[i] = (int) (Math.random()*(max-min) )+ min;
		}
		
		// Afficher le contenu des 2 tableaux
		for(int i = 0; i < 10; i++) {
			System.out.println("Tableau 1[" + i + "] : " + tabInt1[i] + " --- Tableau 2[" + i + "] : " + tabInt2[i]);
		}
		
		// Calculer et afficher le nombre de valeurs communes aux 2 tableaux
		// si une valeur est présente dans les deux tableaux , et qu'elle est aussi
		// présente plusieurs fois dans l'un ou dans les deux tableaux , elle n'est
		// comptée qu'une seule fois
		int cptValeursCommunes = 0;
		List<Integer> intCommuns = new ArrayList<Integer>();

		// parcours du 1er tableau
		for (int i = 0; i < 10; i++) {

			// parcours du 2eme tableau
			for (int j = 0; j < 10; j++) {

				// si il y a une valeur commune
				if (tabInt1[i] == tabInt2[j]) {

					// si la valeur commune n'a pas déjà été entrée dans la String des valeurs
					// communes
					if (!intCommuns.contains(tabInt1[i])) {
						intCommuns.add(tabInt1[i]); // ajout dans la String des int en commun
						cptValeursCommunes++; // incrément du nombre de valeurs communes
					}
				}
			}
		}
		System.out.println("Il y a " + cptValeursCommunes + " valeurs communes entre les 2 tableaux.");
		System.out.println("Ce sont les valeurs suivantes : " + intCommuns);
		 
	}
}
