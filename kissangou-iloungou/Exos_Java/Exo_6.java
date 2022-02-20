package com.demo.tritableau;

import java.util.Arrays;
import java.util.Collections;

/***
 * Enoncé 6 Créez le programme qui tri un tableau d'int en ordre décroissant
 * 
 * convertir un tableau de int en une liste d'integer convertir une liste
 * d'integer en un flux d'integer Trier le flux par ordre décroissant puis
 * reconvertir en un tableau
 * 
 * @author Kissangou ILOUNGOU
 */

public class TriTableau {

	public static void main(String[] args) {

		Integer[] monTableau = { 5, 1, 8, 0, 9, 4, 12, 54, 68, 128 };

		System.out.println("Tableau non trié: " + Arrays.toString(monTableau));

		Arrays.sort(monTableau, Collections.reverseOrder());

		System.out.printf("Tableau trié dans l'ordre décroissant" + Arrays.toString(monTableau));

		// Non terminé

	}
}