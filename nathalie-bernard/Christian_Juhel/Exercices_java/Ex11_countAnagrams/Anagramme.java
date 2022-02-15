package com.demo;

import java.util.ArrayList;
import java.util.List;

/***
 * Exercice 11 Créez un programme java qui détermine le nombre d'anagrammes dans
 * une liste de mots
 * 
 * @author Nathalie Bernard
 *
 */
public class Anagramme {

	/**
	 * Compte le nombre de fois que l'on retrouve le caractère de la varaible
	 * 'lettre' dans la chaîne de caractère de la variable 'mot'
	 * 
	 * @param mot    Une chaîne de caractère
	 * @param lettre Un caractère
	 * @return Le nombre de fois que l'on retrouve le caractère dans le mot
	 */
	public static int compteNbLettres(String mot, char lettre) {
		int cpt = 0;
		for(int i = 0; i < mot.length(); i++) {
			if(mot.charAt(i) == lettre) {
				cpt++;
			}
		}
		return cpt;
	}

	/**
	 * Vérifie si les 2 mots en arguments ont le même nombre d'occurrence d'un même
	 * caractère
	 * 
	 * @param mot    Une chaîne de caractère
	 * @param mot2   Une chaîne de caractère
	 * @param lettre Un caractère
	 * @return true si les deux mots ont le même nombre de fois le caractère, sinon
	 *         false
	 */
	public static boolean memeNbLettres(String mot, String mot2, char lettre) {
		if(compteNbLettres(mot, lettre) == compteNbLettres(mot2, lettre)) {
			return true;
		}
		return false;
	}

	/**
	 * Vérifie qu'un mot est anagramme de l'autre.
	 * 
	 * @param mot1 Une chaîne de caractère
	 * @param mot2 Une chaîne de caractère
	 * @return vrai si les deux mots ont le même nombre de chaque lettre, faux sinon
	 */
	public static boolean estAnagramme(String mot1, String mot2) {
		/*
		 * On vérifie que les 2 mots ont le même nombre de lettres sinon ce n'est pas un
		 * anagramme
		 */
		if(mot1.length() != mot2.length()) {
			return false;
		}
		/*
		 * On vérifie que les 2 mots ont le même nombre d'occurrences de chaque lettre
		 */
		for(int i = 0; i < mot1.length(); i++) {
			if(!memeNbLettres(mot1, mot2, mot1.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	/***
	 * Compte le nombre d'anagramme du mot proposé en argument que contient la liste
	 * 
	 * @param liste      Liste de chaînes de caractères
	 * @param motPropose Chaîne de caractères
	 * @return Le nombre d'anagramme de 'motPropose' qu'on retrouve dans la liste
	 */
	public static int compteAnagramme(List<String> liste, String motPropose) {
		int cpt = 0;
		
		for(String mot : liste) {
			if(estAnagramme(mot, motPropose)) {
				cpt++;
			}
		}
		
		return cpt;
	}
	
	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();
		liste.add("pliante");
		liste.add("plainte");
		liste.add("patelin");
		liste.add("ordre");
		liste.add("roder");
		
		System.out.println(compteAnagramme(liste, "platine"));
		System.out.println(compteAnagramme(liste, "rode"));
		System.out.println(compteAnagramme(liste, "dorer"));
		
	}
}
