package com.demo;
import java.util.Random;

/***
 * Enoncé X 03A Rechercher une valeur dans un tableau Ecrivez le programme Java
 * correspondant al'algorithme qui suit : Definir un tableau d'elements de type
 * entier contenant 15 elements. Remplir ce tableau avec des valeurs aleatoires
 * comprises entre 1 et 10. Puis imprimer les elements du tableau.
 * 
 * Ensuite générer une valeur entière aleatoirement comprise entre 1 et 10 et
 * rechercher cette valeur dans le tableau en commencant par l'indice 0.
 * 
 * Chaque fois que la valeur est trouvee dans le tableau , son indice est
 * affiche. Si la valeur entiere n'a pas ete trouvee dans le tableau , un
 * message est affiche. Sinon le nombre d'occurrences est affiche.
 * 
 * 
 * Enoncé EX 03B Initialiser une variable de type tableau Modifier l'algorithme
 * de l'exercice précédent (3 recherche d'une variable dans un tableau) Modifier
 * le afin que le remplissage du tableau par des nombres aléatoires soit
 * effectué dans une procédure séparée qui sera donc appelée par l'algorithme
 * principal.
 * 
 * 
 * @author Nathalie Bernard
 *
 */
public class RechercheVarTab {
	/**
	 * Affiche le contenu d'un tableau d'entiers
	 * 
	 * @param tab Le tableau d'entier
	 */
	public static void affichage(int tab[]) {
		System.out.print("[ ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println("]");
	}
	
	/***
	 * Fonction qui remplit un tableau vide de valeurs aléatoires entre 0 et 10.
	 * 
	 * @param tab Un tableau d'entiers vide
	 */
	public static void remplirTabAlea(int tab[]) {
		for(int i = 0; i < tab.length; i++) {
			tab[i] = createRandom(11);
		}
	}
	
	/**
	 * Fonction qui renvoie une valeur aléatoire entre 0 et la valeur en argument
	 * 
	 * @param max La borne supérieure pour la génération aléatoire
	 * @return une valeur aléatoire entre 0 et max inclus
	 */
	public static int createRandom(int max) {
		Random rand = new Random();
		return rand.nextInt(max + 1);
	}
	
	/***
	 * Fonction qui cherche une valeur dans un tableau d'entiers. Si la valeur est
	 * trouvee dans le tableau , son indice est affiche. Si la valeur entiere n'a
	 * pas ete trouvee dans le tableau , un message est affiche. Sinon le nombre
	 * d'occurrences est affiche.
	 * 
	 * @param tab Un tableau d'entiers
	 * @param val L'entier qu'on veut trouver
	 */
	public static void chercheValDansTab(int tab[], int val) {
		boolean find = false;
		int indice = -1;
		int cpt = 0;
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == val) {
				indice = i;
				find = true;
				cpt++;
			}
		}
		if(find) {
			if(cpt == 1)
				System.out.println("La valeur " + val + " se trouve dans le tableau à l'indice " + indice);
			else
				System.out.println("La valeur " + val + " se trouve dans le tableau " + cpt + " fois");
		} else {
			System.out.println("La valeur " + val + " ne se trouve pas dans le tableau");
		}
		
	}
	
	public static void main(String[] args) {
		
		// Definir un tableau d'elements de type entier contenant 15 elements.
		int tab[] = new int[15];
		
		// Remplir ce tableau avec des valeurs aleatoires comprises entre 1 et 10. 
		/* Modifier l'algorithme de l'exercice précédent (3 recherche d'une variable dans un tableau)
	     * Modifier le afin que le remplissage du tableau par des nombres aléatoires soit effectué 
		 * dans une procédure séparée qui sera donc appelée par l'algorithme principal.*/
		remplirTabAlea(tab);
		
		//Puis imprimer les elements du tableau
		affichage(tab);
		
		/*Ensuite générer  une  valeur entière aleatoirement comprise entre 1 et 10 
		 * et  rechercher cette valeur  dans le tableau en commencant par l'indice 0.
		 * Chaque fois que la valeur est trouvee dans le tableau , son indice est affiche.
		 * Si la valeur entiere n'a pas ete trouvee dans le tableau , un message est affiche. 
		 * Sinon le nombre d'occurrences est affiche.*/
		chercheValDansTab(tab, createRandom(10));
	}
}
