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


		//=== Afficher le nom et le pr�nom de tous les �tudiants. ===

		/*for(Etudiant e: etudiants) {
			System.out.println(e.getNom() + " " + e.getPrenom());
		}*/

		//=== Afficher le nom et le pr�nom de tous les joueurs de quidditch.===
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




		//=== V�rifier si la liste des �tudiants est non vide. ===
		//System.out.print(etudiants.isEmpty());

		//=== V�rifier si la liste des �tudiants ne contient plus l'�tudiant 
		//Ron Weasley, cr�� pr�c�demment. ===

		/*Etudiant etudiant = new Etudiant ("Ron", "Weasley", false);
		System.out.println(etudiants.contains(etudiant));*/
	}

}

