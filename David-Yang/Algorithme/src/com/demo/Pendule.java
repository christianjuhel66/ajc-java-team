package com.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pendule {

	@SuppressWarnings("resource")
	public static void main (String args[]) 

	{

		Scanner a = new Scanner(System.in);
		String mot = a.nextLine();
		int lengthMot = mot.length();
		String[] res = new String[lengthMot];

		for(int i = 0; i<lengthMot; i++)
		{
			res[i] = "_";
		}
		System.out.println(lengthMot);
		for (String i : res)
		{
			System.out.print(i + " ");
		}
		int erreurs = 0;

		for (int i = 0; i < 11; i++) {
			System.out.println("\nNouvelle entrer:");
			Scanner b = new Scanner(System.in);
			String letter = b.nextLine();
			if (mot.contains(letter)) {

				List<Integer> matchingIndices = new ArrayList<>();
				for (int k = 0; k < mot.length(); k++) {
					if (mot.charAt(k) == letter.charAt(0)) {
						matchingIndices.add(k);
					}
				}
				System.out.print("\n");
				for (i = 0; i < matchingIndices.size(); i++) {
					res[matchingIndices.get(i)] = letter;
				}
				
				for (String x : res) {
					System.out.print(x + " ");
				}
			} else {
				erreurs++;
				if (erreurs == 10) {

					System.out.println("Perdu");
					break;
				}
			}
			System.out.print("\nErreurs:" + erreurs);
		}

	}

}
