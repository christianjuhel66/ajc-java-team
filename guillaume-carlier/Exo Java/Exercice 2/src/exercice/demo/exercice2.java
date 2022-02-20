package exercice.demo;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {

		/*
		 * Exercice : Je recherche mon prénom Recherche et suppression d'un élément dans
		 * un tableau non trié On recherche dans un tableau non trié contenant 20
		 * prénoms, un prénom saisi au clavier. Lorsque cet élément est trouvé, on
		 * l'élimine du tableau en décalant les cases qui le suivent et en mettant à
		 * blanc la dernière case.
		 */

		// déclaration du tableau
		String[] tab = { "Guillaume", "Lucie", "Fred", "Axel", "Arthur", "Evan", "Adrien", "Alexis", "Antoine", "Adam",
				"Alexandre", "Thibault", "Eliot", "Elouan", "Ilan", "Julian", "Kyllian", "Ewan", "Luka", "Rafael" };
		// creation d'un second tableau d'une taille n-1;
		String[] tab2 = new String[tab.length - 1];
		boolean isInTable = false;

		// récupération de l'entrée utilisateur
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez un prénom : ");
		String prenom = scan.nextLine();

		// parcours du tableau
		for (int i = 0; i < tab.length; i++) {
			// vérification de la présence du prenom
			if (tab[i].toUpperCase().equals(prenom.toUpperCase())) {
				// Prenom présent!
				System.out.println("Votre prénom : " + prenom + " a été trouvé à l'index : " + i);
				isInTable = true;

				// stockage des element dans le second tableau a l'index n-1
				for (int j = 0; j < i; j++) {
					tab2[j] = tab[j];
				}
				for (int j = i; j < tab2.length; j++) {
					tab2[j] = tab[j + 1];
				}
			}
			// afficher une seul fois l'absence du prénom
			if (i == tab.length - 1 && isInTable == false) {
				System.out.println("Le prénom n'est pas présent dans le tableau");
			}
		}

		// impression du tableau si présent
		if (isInTable) {
			for (int l = 0; l < tab2.length; l++) {
				System.out.println(tab2[l]);
			}
		}
	}
}
