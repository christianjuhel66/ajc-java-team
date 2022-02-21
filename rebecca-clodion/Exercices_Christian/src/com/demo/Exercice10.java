package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercice10 {

	public static void main(String[] args) {
		
		// Initialise une liste d'Integer et l'affiche, avec éventuellement des doublons.
		List<Integer> myIntList = new ArrayList<Integer>();
		fillingList(1, 11, 10, myIntList);
		System.out.println(myIntList);
		
		// Liste qui contiendra chaque valeur lue (unique)
		List<Integer> intRead = new ArrayList<Integer>();
		
		// Liste des doublons
		List<Integer> doublons = new ArrayList<Integer>();
		
		// Compteur de doublons
		int cptDoublons = 0;
		
		// Créez la fonctionnalité qui détecte le nombre de doublons
		for (int i = 0; i < myIntList.size(); i++) {
			if (! intRead.contains(myIntList.get(i))){
				intRead.add(myIntList.get(i));
				if (myIntList.subList(i+1, myIntList.size()).contains(myIntList.get(i))) {
					cptDoublons += 1;
					doublons.add(myIntList.get(i));
				}
			}
		}		
		
		System.out.println("Il y a " + cptDoublons + " doublons : " + doublons);

	}
	
	// Fonction permettant de remplir une liste avec des nombres aléatoires
	public static List<Integer> fillingList(int min, int max, int size, List<Integer> listInt) {
		for (int i = 0; i < size; i++) {
			listInt.add((int) (Math.random() * (max - min)) + min);
		}
		return listInt;
	}

}
