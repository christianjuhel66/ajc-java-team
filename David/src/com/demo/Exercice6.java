package com.demo;

public class Exercice6 {

	public static void main(String[] args) {

		int min = 1;
		int max = 11;
		int[] tab = new int[10];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = (int) ((Math.random() * (max - min)) + min);
			System.out.print(tab[i] + " ");
		}
		int temp;  
		//initializing an array  
		for (int i = 0; i < tab.length; i++)   
		{  
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[i] < tab[j]) {
					temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
				}
			}
		}
		System.out.println("\nOrdre decroissant");
		for (int i : tab)   
		{  
			System.out.print(i + " ");
		}  
	}
}
