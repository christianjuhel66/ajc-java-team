package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EnsembleString {

	public static void main(String[] args) {
		Set<String> couleurs = new HashSet<String>();
		couleurs.add("Rouge");
		couleurs.add("Bleu");
		couleurs.add("Vert");
		couleurs.add("Rouge");
		couleurs.add("Rose");
		couleurs.add("Orange");

		//=== Afficher tous les éléments du Set ===

		/*for(String couleur : couleurs) {
			System.out.println(couleur);
		}*/

		//Constater que l'ensemble contient bien "Bleu". 
		/*System.out.println(couleurs.contains("Bleu"));*/


		/* === Ecrire un foreach où à l'intérieur, on veut supprimer l'élément en cours. 
		Et constater que nous avons une exception. 
		Donc mettre ce code dans un bloc de gestion des exceptions. === */

		/*for (String couleur : couleurs) {
			couleurs.remove(couleur);
		}*/

		/*try {

			for (String couleur : couleurs) {
				couleurs.remove(couleur);
			}

		}
		catch(Exception e){
			System.out.println("Impossible de supprimer cet element ");
		}*/

		//=== Retirer (toutes) les couleurs ===
		
		//couleurs.removeAll(couleurs);

		//=== Vérifier si l'ensemble est vide. ===
		
		//System.out.println(couleurs.isEmpty());

		//=== Bonus : trouver un moyen de supprimer automatiquement tous les éléments 
		//contenant la lettre "e". ===

		/*Set<String> couleurs2 = new HashSet<String>();
		for(String couleur : couleurs) {
			if(! couleur.contains("e")) {
				couleurs2.add(couleur);
			}
		}
		couleurs = couleurs2;*/

	}
}
