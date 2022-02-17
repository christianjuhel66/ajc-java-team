package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<String> liste = new ArrayList<String>();  
		int cpt = 0;
		while (cpt <= 5) {
		Scanner a = new Scanner(System.in);
		String mot = a.nextLine();

		if (liste.contains(mot)) {

		}
		else {
			liste.add(mot);
			cpt++;
		}
		System.out.println(liste.toString());}
	}
}


