package collections;

import java.util.List;
import java.util.ArrayList;

public class TestEtudiant {

	public static void main(String[] args) {

		List<Etudiant> etudiants = new ArrayList<Etudiant>();

		etudiants.add(new Etudiant ("Harry", "Potter", true));
		etudiants.add(new Etudiant ("Ron", "Weasley", false));
		etudiants.add(new Etudiant ("Drago", "Malefoy", true));
		etudiants.add(new Etudiant ("Hermione", "Granger", false));


		//=== Afficher le nom et le prénom de tous les étudiants. ===

		/*for(Etudiant e: etudiants) {
			System.out.println(e.getNom() + " " + e.getPrenom());
		}*/

		//=== Afficher le nom et le prénom de tous les joueurs de quidditch.===
		/*for(Etudiant e: etudiants) {

			if(e.isJoueurQuidditch()) {
				System.out.println(e.getNom() + " " + e.getPrenom());
			}
		}*/

		//=== Retirer de la liste tous les non joueurs de quidditch.===

		/*for(int i = 0; i < etudiants.size(); i++) {
			if (! etudiants.get(i).isJoueurQuidditch()) {
				System.out.println(etudiants.get(i).getNom());
				etudiants.remove(i);			
			}
		}

		for(Etudiant e: etudiants) {
		System.out.println(e.getNom() + " " + e.getPrenom() + " "+ e.isJoueurQuidditch());
		}*/




		//=== Vérifier si la liste des étudiants est non vide. ===
		//System.out.print(etudiants.isEmpty());

		//=== Vérifier si la liste des étudiants ne contient plus l'étudiant 
		//Ron Weasley, créé précédemment. ===

		/*Etudiant etudiant = new Etudiant ("Ron", "Weasley", false);
		System.out.println(etudiants.contains(etudiant));*/
	}

}

