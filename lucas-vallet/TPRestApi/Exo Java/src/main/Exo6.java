package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exo6 {

	public static void main(String[] args) {
		int[] arrayInt = {5,2,4,3,1};
		orderArrayByDesc(arrayInt);
		for (int i = 0; i < arrayInt.length; i++) {
			 System.out.println(arrayInt[i]);
		 }

	}
	
	public static void orderArrayByDesc(int[] arrayInt) {
		//conversion en une liste d'integer(sans stream
		List<Integer> listInteger = new ArrayList<Integer>();
		for(int i: arrayInt) {
			listInteger.add(i);
		}
		//conversion en un flux 
		 List<Integer> results = listInteger.stream()
				 .sorted(Collections.reverseOrder()) // trie en ordre decroissant
				 .collect(Collectors.toList());      //Reconversion en liste
		 
		 //Mettre le tableau trié dans un array
		arrayInt = results.stream() //converstion de result en stream
				.mapToInt(Integer::intValue) //convertion des elements du stream en in
				.toArray();; //Création d'un array int[] 
	}

}
