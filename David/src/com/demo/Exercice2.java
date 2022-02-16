package com.demo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 11;

		Integer [] tab1 = new Integer[10]; 
		Integer [] tab2 = new Integer[10]; 

		for (int i=0;i<10;i++)
		
		{
			tab1[i] = (int)((Math.random() * (max - min)) + min);
			tab2[i] = (int)((Math.random() * (max - min)) + min);
			System.out.print("tab1: "+tab1[i]);
			System.out.print("tab2: " + tab2[i] + "\n");
		}
		
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(tab1));
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(tab2));
		s1.retainAll(s2);

		Integer[] inter = s1.toArray(new Integer[s1.size()]);
		int cpt = inter.length;
		System.out.print("\nCompteur:"+cpt);

}
}