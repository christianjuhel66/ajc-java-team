package com.demo;

public class Exercice3 {

	public static void main(String[] args) {

		// Definir un tableau d'elements de type entier contenant 15 elements
		int[] tabInt = new int[15];

		// Definir un min et un max pour générer les valeurs aléatoires
		int min = 1;
		int max = 11;

		// Remplir ce tableau avec des valeurs aleatoires comprises entre 1 et 10
		for (int i = 0; i < 10; i++) {
			tabInt[i] = (int) (Math.random() * (max - min)) + min;
		}

		// Puis imprimer les elements du tableau.
		for (int i = 0; i < 10; i++) {
			System.out.println("Tableau[" + i + "] : " + tabInt[i]);
		}

		// générer une valeur entière aleatoirement comprise entre 1 et 10
		int randomInt = (int) (Math.random() * (max - min)) + min;
		System.out.println("Valeur aléatoire générée : " + randomInt);

		// rechercher cette valeur dans le tableau en commencant par l'indice 0.
		// Chaque fois que la valeur est trouvee dans le tableau , son indice est
		// affiche
		boolean isInTab = false; // booléen pour présence dans la tableau ou non
		int cptOccurences = 0; // int pour compter le nombre d'occurences
		for (int i = 0; i < 10; i++) {
			if (randomInt == tabInt[i]) {
				isInTab = true;
				cptOccurences += 1;
				System.out.println("Occurence " + cptOccurences + " à l'indice : " + i);
			}
		}

		// Si la valeur entiere n'a pas ete trouvee dans le tableau , un message est
		// affiche
		if (isInTab == false) {
			System.out.println("La valeur " + randomInt + " n'est pas présente dans le tableau");
		} else { // Sinon le nombre d'occurrences est affiche.
			System.out
					.println("Il y a " + cptOccurences + " occurences de la valeur " + randomInt + " dans le tableau");
		}

	}

}
