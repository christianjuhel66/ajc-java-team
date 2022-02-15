package com.nodDoublon;

import java.util.ArrayList;
import java.util.List;

/***
 * Exercice 07 Cr�ez une classe qui stocke des mots uniques ( sans doublon) dans
 * une liste Cr�ez la fonctionnalit� qui ajoute et qui supprime des mots dans
 * cette liste tout en garantissant l'absence de doublons.
 * 
 * @author Nathalie Bernard
 *
 */
public class NoDoublon {

	List<String> listeMot = new ArrayList<String>();
	
	/**
	 * Fonction qui v�rifie si le mot existe d�j� dans la liste de mots de la classe
	 * 
	 * @param mot2 Un String correspondant � un mot
	 * @return true si la mot existe d�j� dans la liste, false sinon
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
	 * Fonction qui ajoute � la liste de mots de la classe le mot en argument si il
	 * n'est pas d�j� pr�sent
	 * 
	 * @param mot Un String correspondant � un mot qu'on souhaite ajouter
	 */
	protected void ajouterMot(String mot) {
		if(!motExisteDeja(mot)) {
			this.listeMot.add(mot);
		} else {
			System.out.println("Le mot " + mot + " existe d�j�!");
		}
	}
	
	/**
	 * Supprime de la liste de mots le mot entr� en argument
	 * 
	 * @param mot String d'un mot
	 */
	protected void supprimerMot(String mot) {
		if(listeMot.contains(mot)) {
			boolean effacer = listeMot.remove(mot);
			if(effacer) {
				System.out.println("Le mot " + mot + " a bien �t� effac�!");
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
