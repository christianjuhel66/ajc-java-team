package exercice.demo;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {

		/*
		 * Exercice : Je recherche mon pr�nom Recherche et suppression d'un �l�ment dans
		 * un tableau non tri� On recherche dans un tableau non tri� contenant 20
		 * pr�noms, un pr�nom saisi au clavier. Lorsque cet �l�ment est trouv�, on
		 * l'�limine du tableau en d�calant les cases qui le suivent et en mettant �
		 * blanc la derni�re case.
		 */

		// d�claration du tableau
		String[] tab = { "Guillaume", "Lucie", "Fred", "Axel", "Arthur", "Evan", "Adrien", "Alexis", "Antoine", "Adam",
				"Alexandre", "Thibault", "Eliot", "Elouan", "Ilan", "Julian", "Kyllian", "Ewan", "Luka", "Rafael" };
		// creation d'un second tableau d'une taille n-1;
		String[] tab2 = new String[tab.length - 1];
		boolean isInTable = false;

		// r�cup�ration de l'entr�e utilisateur
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez un pr�nom : ");
		String prenom = scan.nextLine();

		// parcours du tableau
		for (int i = 0; i < tab.length; i++) {
			// v�rification de la pr�sence du prenom
			if (tab[i].toUpperCase().equals(prenom.toUpperCase())) {
				// Prenom pr�sent!
				System.out.println("Votre pr�nom : " + prenom + " a �t� trouv� � l'index : " + i);
				isInTable = true;

				// stockage des element dans le second tableau a l'index n-1
				for (int j = 0; j < i; j++) {
					tab2[j] = tab[j];
				}
				for (int j = i; j < tab2.length; j++) {
					tab2[j] = tab[j + 1];
				}
			}
			// afficher une seul fois l'absence du pr�nom
			if (i == tab.length - 1 && isInTable == false) {
				System.out.println("Le pr�nom n'est pas pr�sent dans le tableau");
			}
		}

		// impression du tableau si pr�sent
		if (isInTable) {
			for (int l = 0; l < tab2.length; l++) {
				System.out.println(tab2[l]);
			}
		}
	}
}
