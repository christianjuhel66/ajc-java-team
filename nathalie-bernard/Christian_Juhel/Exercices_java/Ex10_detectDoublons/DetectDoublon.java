package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Exercice 10 Coder un programme java qui initialise une liste d'entiers , avec
 * éventuellement des doublons. Créez la fonctionnalité qui détecte le nombre de
 * doublons
 * 
 * @author Nathalie Bernard
 *
 */
public class DetectDoublon {
	/**
	 * Retourne un nombre aléatoire entre 0 et la valeur en argument
	 * 
	 * @param max La borne supérieure pour la génération aléatoire
	 * @return Un entier entre 0 et max inclus
	 */
	public static int createRandom(int max) {
		Random rand = new Random();
		return rand.nextInt(max + 1);
	}
	
	/**
	 * Créer un tableau de valeurs aléatoires entre 0 et max
	 * 
	 * @param max    La valeur maximum que peut avoir le tableau
	 * @param taille La taille du tableau d'entiers
	 * @return un tableau d'entiers
	 */
	public static List<Integer> createTabRandom(int max, int taille) {
		List<Integer> tab = new ArrayList<Integer>();
		while(tab.size() < taille) {
			tab.add(createRandom(max));
		}
		return tab;
	}
	
	/**
	 * Compte le nombre de doublons. Si un nombre est présent 3 fois cela fait 2
	 * doublons par exemple.
	 * 
	 * @param liste d'Integer
	 * @return Le nombre de doublons trouvés dans la liste
	 */
	public static int nbDoublons(List<Integer> liste) {
		int cpt = 0;
		for(int i = 0; i < liste.size(); i++) {
			boolean find = false;
			for(int j = i + 1; j < liste.size(); j++) {
				if(liste.get(i).equals(liste.get(j))){
					find = true;
					//System.out.println("i : " + i + " " + " j :" + j );
				}
			}
			if(find) {
				cpt++;
			}
		}
		return cpt;
	}
	
	/**
	 * Affichage du contenu d'une liste
	 * 
	 * @param liste d'Integer
	 */
	public static void affichage(List<Integer> liste) {
		System.out.print("[ ");
		for(int val : liste) {
			System.out.print(val + " ");
		}
		System.out.print(" ]");
	}
	
	public static void main(String[] args) {
		List<Integer> tab = createTabRandom(10, 10);
		int cptDoublons = nbDoublons(tab);
		System.out.println(cptDoublons);
		affichage(tab);
	}
}
