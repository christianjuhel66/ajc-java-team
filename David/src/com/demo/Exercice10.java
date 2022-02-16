package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercice10 {

	public static void main(String[] args) {

		int min = 1;
		int max = 11;
		List<Integer> liste = new ArrayList<Integer>();  

		for (int i = 0; i < 10; i++) {

			liste.add((int) ((Math.random() * (max - min)) + min));
		}
		System.out.print(liste.toString() + " ");
		System.out.print("\n");

		Set<Integer> set = new HashSet<Integer>(liste);
	    for (Integer r : set) {
			System.out.println(r + ": " + Collections.frequency(liste, r));
	    }
		}

}
