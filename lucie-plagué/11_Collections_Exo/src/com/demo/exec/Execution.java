package com.demo.exec;

import java.util.ArrayList;
import java.util.List;

import com.demo.modele.Etudiant;

public class Execution {

	public static void main(String[] args) {
		
		Etudiant etudiant1 = new Etudiant("Harry", "Potter", true);
		Etudiant etudiant2 = new Etudiant("Ron", "Weasley", true);
		Etudiant etudiant3 = new Etudiant("Hermione", "Granger", false);
		Etudiant etudiant4 = new Etudiant("Drago", "Malefoy", true); 
		
		List<Etudiant> etudiantsList = new ArrayList<Etudiant>();
		
		etudiantsList.add(etudiant1);
		etudiantsList.add(etudiant2);
		etudiantsList.add(etudiant3);
		etudiantsList.add(etudiant4);
		
		for (Etudiant e : etudiantsList) {
			System.out.println(e.getPrenomNom());
		}

	}

}
