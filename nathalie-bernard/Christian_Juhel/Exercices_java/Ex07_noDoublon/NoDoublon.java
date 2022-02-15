package com.nodDoublon;

import java.util.ArrayList;
import java.util.List;

/***
 * Exercice 07 Créez une classe qui stocke des mots uniques ( sans doublon) dans
 * une liste Créez la fonctionnalité qui ajoute et qui supprime des mots dans
 * cette liste tout en garantissant l'absence de doublons.
 * 
 * @author Nathalie Bernard
 *
 */
public class NoDoublon {

	List<String> listeMot = new ArrayList<String>();
	
	/**
	 * Fonction qui vérifie si le mot existe déjà dans la liste de mots de la classe
	 * 
	 * @param mot2 Un String correspondant à un mot
	 * @return true si la mot existe déjà dans la liste, false sinon
	 */
	private boolean motExisteDeja(String mot2) {
		for(String mot : listeMot) {
			if(mot.equals(mot2)) {
				return true;
			}
		}
		return false;
		
	}

	/**
	 * Fonction qui ajoute à la liste de mots de la classe le mot en argument si il
	 * n'est pas déjà présent
	 * 
	 * @param mot Un String correspondant à un mot qu'on souhaite ajouter
	 */
	protected void ajouterMot(String mot) {
		if(!motExisteDeja(mot)) {
			this.listeMot.add(mot);
		} else {
			System.out.println("Le mot " + mot + " existe déjà!");
		}
	}
	
	/**
	 * Supprime de la liste de mots le mot entré en argument
	 * 
	 * @param mot String d'un mot
	 */
	protected void supprimerMot(String mot) {
		if(listeMot.contains(mot)) {
			boolean effacer = listeMot.remove(mot);
			if(effacer) {
				System.out.println("Le mot " + mot + " a bien été effacé!");
			}
			
		}
	}
	
	/**
	 * Affiche le contenu de la liste ListeMots
	 */
	public void afficherListeMots() {
		for(String mot : this.listeMot) {
			System.out.println(mot);
		}
	}
}
