package com.demo;

import java.util.ArrayList;
import java.util.List;

/***
 * EX 02 Rechercher des valeurs communes � deux tableaux 1)D�finir deux tableaux
 * de 10 �l�ments de type entier et les remplir avec des valeurs aleatoires
 * comprises entre 1 et 10 2) afficher le contenu de ces deux tableaux �l�ment
 * par �l�ment 3) calculer et afficher le nombre de valeurs communes � ces deux
 * tableaux 4) si une valeur est pr�sente dans les deux tableaux , et qu'elle
 * est aussi pr�sente plusieurs fois dans l'un ou dans les deux tableaux , elle
 * n'est compt�e qu'une seule fois
 * 
 * @author Nathalie Bernard
 *
 */
public class ValeursCommunes {
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
	
	/**
	 * Compte les valeurs en commun entre les 2 tableaux. Dans cette fonction une
	 * valeur en commun correspond � la m�me valeur au m�me indice.
	 * 
	 * @param tab  Premier tableau d'entiers
	 * @param tab2 Deuxi�me tableau d'entiers
	 */
	public static void valeursCommunes(int tab[], int tab2[]) {
		int cpt = 0;
	
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == tab2[i]) {
				cpt ++;
			}
		}
		System.out.println("Le nombre de valeurs communes entre les 2 tableaux est de : " + cpt);
	}
	
	/***
	 * Fonction v�rifie si la valeur a d�j� �tait comp
	 * @param l liste de valeurs uniques d'un des tableaux
	 * @param val entier dont on veut v�rifier qu'il n'a pas encore �tait pris en compte
	 * @return true si la valeur a d�j� �tait compt� dans le tableau sinon false
	 */
	public static boolean estDoublon(List<Integer> l, int val) {
		for(int valListe : l) {
			if(valListe == val) {
				return true;
			}
		}
		return false;
	}
	
	/***
	 * Compte les valeurs en commun entre les 2 tableaux. si une valeur est pr�sente
	 * dans les deux tableaux , et qu'elle est aussi pr�sente plusieurs fois dans
	 * l'un ou dans les deux tableaux , elle n'est compt�e qu'une seule fois
	 * 
	 * @param tab  Premier tableau d'entiers
	 * @param tab2 Deuxi�me tableau d'entiers
	 */
	public static void valeursCommunes2(int tab[], int tab2[]) {
		List<Integer> liste = new ArrayList<Integer>();
	
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab2.length; j++) {
				if(tab[i] == tab2[j]) {
					if(!estDoublon(liste, tab[i])) {
						liste.add(tab[i]);
					}
				}
			}
		}
		System.out.println("Le nombre de valeurs communes entre les 2 tableaux est de : " + liste.size());
	}
	
	public static void main(String[] args) {
		
		//1)D�finir deux tableaux de 10 �l�ments de type entier et les remplir 
		int tab[] = {1, 3, 10, 5 , 4 , 8, 9 , 14, 12, 2};
		//int tab2[] = {1, 3, 10, 5 , 4 , 8, 9 , 14, 12, 2};
		int tab2[] = {2, 0, 3, 2 , 4 , 8, 9 , 14, 12, 2};
		
		//2)afficher le contenu de ces deux tableaux �l�ment par �l�ment
		affichage(tab);
		affichage(tab2);
		
		//3) calculer et afficher le nombre de valeurs communes � ces deux tableaux
		valeursCommunes(tab, tab2);
		
		//4) si une valeur est pr�sente dans les deux tableaux , et qu'elle est aussi
		//pr�sente plusieurs fois dans l'un ou dans les deux tableaux , elle  n'est compt�e qu'une seule fois 
		valeursCommunes2(tab, tab2);
	}
}
