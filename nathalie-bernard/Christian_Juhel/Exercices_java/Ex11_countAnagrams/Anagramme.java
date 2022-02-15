package com.demo;

import java.util.ArrayList;
import java.util.List;

/***
 * Exercice 11 Cr�ez un programme java qui d�termine le nombre d'anagrammes dans
 * une liste de mots
 * 
 * @author Nathalie Bernard
 *
 */
public class Anagramme {

	/**
	 * Compte le nombre de fois que l'on retrouve le caract�re de la varaible
	 * 'lettre' dans la cha�ne de caract�re de la variable 'mot'
	 * 
	 * @param mot    Une cha�ne de caract�re
	 * @param lettre Un caract�re
	 * @return Le nombre de fois que l'on retrouve le caract�re dans le mot
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
	 * V�rifie si les 2 mots en arguments ont le m�me nombre d'occurrence d'un m�me
	 * caract�re
	 * 
	 * @param mot    Une cha�ne de caract�re
	 * @param mot2   Une cha�ne de caract�re
	 * @param lettre Un caract�re
	 * @return true si les deux mots ont le m�me nombre de fois le caract�re, sinon
	 *         false
	 */
	public static boolean memeNbLettres(String mot, String mot2, char lettre) {
		if(compteNbLettres(mot, lettre) == compteNbLettres(mot2, lettre)) {
			return true;
		}
		return false;
	}

	/**
	 * V�rifie qu'un mot est anagramme de l'autre.
	 * 
	 * @param mot1 Une cha�ne de caract�re
	 * @param mot2 Une cha�ne de caract�re
	 * @return vrai si les deux mots ont le m�me nombre de chaque lettre, faux sinon
	 */
	public static boolean estAnagramme(String mot1, String mot2) {
		/*
		 * On v�rifie que les 2 mots ont le m�me nombre de lettres sinon ce n'est pas un
		 * anagramme
		 */
		if(mot1.length() != mot2.length()) {
			return false;
		}
		/*
		 * On v�rifie que les 2 mots ont le m�me nombre d'occurrences de chaque lettre
		 */
		for(int i = 0; i < mot1.length(); i++) {
			if(!memeNbLettres(mot1, mot2, mot1.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	/***
	 * Compte le nombre d'anagramme du mot propos� en argument que contient la liste
	 * 
	 * @param liste      Liste de cha�nes de caract�res
	 * @param motPropose Cha�ne de caract�res
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
