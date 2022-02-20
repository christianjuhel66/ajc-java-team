package com.demo;

public class Exercice4 {

	public static void main(String[] args) {
		/**
		 * Ennoncé EX 03B Initialiser une variable de type tableau Modifier l'algorithme
		 * de l'exercice précédent (3 recherche d'une variable dans un tableau) Modifier
		 * le afin que le remplissage du tableau par des nombres aléatoires soit
		 * effectué dans une procédure séparée qui sera donc appelée par l'algorithme
		 * principal.
		 **/

		// Definir un tableau d'elements de type entier contenant 15 element
		int[] tabInt = new int[15];

		// Remplir ce tableau avec des valeurs aleatoires comprises entre 1 et 10
		fillingTab(1, 11, 15, tabInt);

		// Puis imprimer les elements du tableau.
		for (int i = 0; i < 10; i++) {
			System.out.println("Tableau[" + i + "] : " + tabInt[i]);
		}

	}
	
	// Fonction permettant de remplir un tableau avec des nombres aléatoires
	public static int[] fillingTab(int min, int max, int size, int[] tab) {
		for (int i = 0; i < size; i++) {
			tab[i] = (int) (Math.random() * (max - min)) + min;
		}
		return tab;
	}

}
