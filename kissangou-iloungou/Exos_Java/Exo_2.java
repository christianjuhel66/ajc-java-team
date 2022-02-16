package com.demo.tableau;

/***
 * Enoncé EX 2 Rechercher des valeurs communes à deux tableaux 
 * @author Kissangou ILOUNGOU
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RechercheValeursCommunes {

	public static void main(String[] args) {

		// 1) Définir deux tableaux de10 éléments de type entier et les remplir avec des
		// valeurs aleatoires comprises entre 1 et 10

		int[] monTableauUn, monTableauDeux;
		monTableauUn = new Random().ints(10, 0, 10).toArray();
		monTableauDeux = new Random().ints(10, 0, 10).toArray();

		// 2) afficher le contenu de ces deux tableaux élément par élément

		System.out.println(Arrays.toString(monTableauUn));
		System.out.println(Arrays.toString(monTableauDeux));
		System.out.println("*****************************");

		// 3) calculer et afficher le nombre de valeurs communes à ces deux tableaux

		List<Integer> sameValues = new ArrayList<Integer>();
		for (int i = 0; i < monTableauUn.length; i++) {
			for (int j = 0; j < monTableauDeux.length; j++) {
				if (monTableauUn[i] == monTableauDeux[j]) {
					if (!sameValues.contains(Integer.valueOf(monTableauUn[i]))) {
						sameValues.add(Integer.valueOf(monTableauUn[i]));

						// 4) si une valeur est présente dans les deux tableaux , et qu'elle est aussi
						// présente plusieurs fois dans l'un ou dans les deux tableaux , elle n'est
						// comptée qu'une seule fois

						// Non solutionné...

						System.out.println("Il y a " + sameValues.size() + " valeurs identiques");
					}
				}
			}
		}
	}
}