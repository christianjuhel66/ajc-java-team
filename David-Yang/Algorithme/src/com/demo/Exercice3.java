package com.demo;

public class Exercice3 {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 11;
		int[] tab = new int[15];
		for (int i = 0; i < tab.length; i++) {

			tab[i] = (int) ((Math.random() * (max - min)) + min);
			System.out.print(tab[i] + " ");
		}
		int target = (int) ((Math.random() * (max - min)) + min);
		System.out.println("\ntarget:" + target);

		int cpt = 0;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == target) {
				cpt++;
				System.out.println("Indices:" + i);
			}
			else {
				continue;
			}
		}
 
		if (cpt == 0) {
			System.out.println("Element non trouvé,occurrence 0");
		}else {
			System.out.println("Nb occurrences:" + cpt);

		}
	}

}
