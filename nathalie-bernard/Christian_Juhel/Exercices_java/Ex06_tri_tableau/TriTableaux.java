package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercice 06 Créez le programme qui tri un tableau d'int en ordre décroissant
 * 
 * convertir un tableau de int en une liste d'integer convertir une liste
 * d'integer en un flux d'integer Trier le flux par ordre décroissant puis
 * reconvertir en un tableau
 * 
 * @author Nathalie Bernard
 *
 */
public class TriTableaux {

	/**
	 * Fonction qui trie un tableau dans l'ordre décroissant
	 * 
	 * @param tab Un tableau d'entiers
	 */
	public static void triDecroissantSimple(int tab[]) {
		int imax;
		int tmp;
		for(int i = 0; i < tab.length; i++) {
			imax = i;
			for(int j = i; j < tab.length; j++) {
				if(tab[imax] < tab[j]) {
					imax = j;
				}
			}
			tmp = tab[i];
			tab[i] = tab[imax];
			tab[imax] = tmp;
		}
	}

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
	public static int[] createTabRandom(int max, int taille) {
		int[] tab = new int[taille];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = createRandom(max);
		}
		return tab;
	}

	/**
	 * Affiche le contenu d'un tableau d'entiers
	 * 
	 * @param tab Un tableau d'entiers
	 */
	public static void affichage(int tab[]) {
		System.out.print("[ ");
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * Affiche le contenu d'une liste d'entiers
	 * 
	 * @param liste Une liste d'entiers
	 */
	public static void affichageListe(List<Integer> liste) {
		System.out.print("[ ");
		for(int val : liste) {
			System.out.print(val + " ");
		}
		System.out.println("]");
	}

	/**
	 * Affiche le contenu d'un flux d'Integer
	 * 
	 * @param stream Un flux d'Integer
	 */
	public static void affichageFlux(Stream<Integer> stream) {
		System.out.print("[ ");
		stream.forEach(x -> System.out.print(x + " "));
		System.out.println("]");
	}

	public static void main(String[] args) {

		int[] tab = createTabRandom(20, 15);
		System.out.println("Tab (non trié):");
		affichage(tab);


		//Créez le programme qui tri un tableau d'int en ordre décroissant
		triDecroissantSimple(tab);
		System.out.println("Tab (trié):");
		affichage(tab);

		int[] tab2 = createTabRandom(20, 15);
		System.out.println("\nTab2 (non trié):");
		affichage(tab2);

		/* Convertir un tableau de int en une liste d'integer
		 * Convertir une liste d'integer en un flux d'integer
		 * Trier le flux par ordre décroissant puis reconvertir en liste
		 */
		List<Integer> liste = Arrays.stream(tab2).boxed().collect(Collectors.toList());
		Stream<Integer> stream = liste.stream();
		liste = stream.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("liste(trié):");
		affichageListe(liste);
		
		/*
		 * Convertir la liste en tableau
		 */
		int[] tab3 = new int[liste.size()];
		for (int i = 0; i < tab3.length; i++) {
			tab3[i] = liste.get(i);
		}
		System.out.println("\nTab3 (convertit à partir de la liste triée):");
		affichage(tab3);

	}

}
