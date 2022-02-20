package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercice7 {

	public static void main(String[] args) {
		/*
		 * Créez une classe qui stocke des mots uniques ( sans doublon) dans une liste
		 * Créez la fonctionnalité qui ajoute et qui supprime des mots dans cette liste 
		 * tout en garantissant l'absence de doublons.
		 */

		List<String> myStringList = new ArrayList<String>();
		myStringList.add("poisson");
		myStringList.add("viande");
		myStringList.add("blé");
		myStringList.add("brocolis");
		
		System.out.println(myStringList);
		addWord("Viande", myStringList);
		System.out.println(myStringList);
		System.out.println("--------------------------------------------");
		addWord("poireaux", myStringList);
		System.out.println(myStringList);
		System.out.println("--------------------------------------------");
		removeWord("blé", myStringList);
		System.out.println(myStringList);
		
	}
	
	public static List<String> addWord(String word, List<String> stringList){
		word = word.toLowerCase();
		if (! stringList.contains(word)) {
			stringList.add(word);
			System.out.println("Le mot " + word + " a été ajouté à la liste.");
		} else {
			System.out.println("Le mot " + word + " existe déjà dans la liste.");
		}
		return stringList;
	}
	
	public static List<String> removeWord(String word, List<String> stringList){
		word = word.toLowerCase();
		stringList.remove(word);
		System.out.println("Le mot " + word + " a été supprimé de la liste.");
		return stringList;
	}

}
