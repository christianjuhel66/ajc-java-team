package ajc.exercice;

import java.util.Arrays;

public class Exercice {

	public static void main(String[] args) {

		 /* EX 03A Rechercher une valeur dans un tableau
		 *  Ecrivez  le programme Java correspondant al'algorithme qui suit :
		 *  Definir un tableau d'elements de type entier contenant 15 elements.
		 *  Remplir ce tableau avec des valeurs aleatoires comprises entre 1 et 10. 
		 *  Puis imprimer les elements du tableau.
		 * 
		 *  Ensuite générer  une  valeur entière aleatoirement comprise entre 1 et 10 
		 *  et   rechercher cette valeur  dans le tableau en commencant par l'indice 0. 
		 * 
		 *  Chaque fois que la valeur est trouvee dans le tableau , son indice est affiche.
		 *  Si la valeur entiere n'a pas ete trouvee dans le tableau , un message est affiche. 
		 *  Sinon le nombre d'occurrences est affiche. 
		 */
		
		// déclaration du tableau
		int tab[] = new int[15];
		
		// remplissage du tableau avec des valeurs aléatoires et impression
		for (int i = 0; i < tab.length; i++) {
			tab[i] = getRandom();
			System.out.println(tab[i]);
		}
		
		// generation d'une valeur aleatoire
		int val = getRandom();
		//verification de sa présence dans le tableau
		int test = isPresent(val, tab);
		
		
		if (test == 0) {
			System.out.println("La valeur " + val + " n'est pas dans le tableau.");
		} else if (test == 1) {
			int index = find(tab, val);
			System.out.println("L'index de " + val + " est : " + index);
		} else {
			String tabIndex = findMultiple(tab, val, test);
			
			System.out.println("La valeur " + val + " apparait " + test + " fois dans le tableau");
			System.out.println("Elle apparait aux index : " + tabIndex);
		}
	}

	// fonction pour récuperer un chiffre aléatoire en 1 et 10
	public static Integer getRandom() {
		return (int) (Math.random()*(10-1)+1);
	}
	
	// fonction pour verifier la présence des valeurs et retourne le nombre de fois ou elle est présente
	public static int isPresent(int valeur, int[] tab) {
		int present = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == valeur) {
				present++;
			}
		}
		return present;
	}
	
	// récupération 1 seul index
	public static int find(int[] array, int value) {
		int index = 0;
	    for(int i=0; i<array.length; i++) 
	         if(array[i] == value) {
	             index = i;
	         }
	    return index;
	}
	
	// fonction pour récupération plusieurs index
	public static String findMultiple(int[] array, int value, int taille) {
		String index = "";
	    for(int i=0; i<array.length; i++) 
	         if(array[i] == value) {
	             index += i + " - ";
	         }
	    return index;
	}
}
