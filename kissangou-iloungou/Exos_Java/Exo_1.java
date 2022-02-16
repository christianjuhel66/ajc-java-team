package com.demo.fonctions;

/***
 * Enoncé EX 01 Fonctions Ecrivez la procédure qui affiche la bannière suivante
 ********************************************************************* 
 ** BIENVENUE AUX JAVAISTES **
 *********************************************************************
 * @author Kissangou ILOUNGOU
 */

public class BanniereBienvenue {

	/*
	 * Step 1: Constructeur affichageBanniere avec ses arguments Char pour le
	 * symbole *, int L pour la longueur, int l pour la largeur et String titre pour
	 * le titre
	 */

	public static void affichageBanniere(char symbole, int L, int l, String titre) {

		// Step 2: Compteur + boucle for + méthode charAt() qui renvoie titre

		int cpt = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < L; j++) {
				if (i == l - 1 || i == 0 || j == L - 1 || j == 0 || j == L - 2 || j == 1)
					System.out.print(symbole);
				else if (i == l / 2 && j > (L / 2 - titre.length() / 2) && cpt < titre.length()) {
					System.out.print(titre.charAt(cpt));
					cpt++;
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	// Step 3: main qui affiche le résultat

	public static void main(String[] args) {
		String titre = "BIENVENUE AUX JAVAISTES";
		affichageBanniere('*', 55, 5, titre);
	}
}
