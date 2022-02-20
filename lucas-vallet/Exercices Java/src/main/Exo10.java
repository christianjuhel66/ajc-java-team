package main;

import java.util.ArrayList;
import java.util.List;

public class Exo10 {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList();
		listInt.add(1);
		listInt.add(9);
		listInt.add(4);
		listInt.add(3);
		listInt.add(4);
		listInt.add(6);
		listInt.add(9);
		listInt.add(9);
		//Il y a 3 doublons (deux 4, trois 9)
		List<Integer> listValues = new ArrayList();
		int doublonCount=0;
		for(Integer i:listInt) {
			if(listValues.contains(i)) {
				doublonCount++;
			}
			else listValues.add(i);
		}
		
		System.out.println("Il y a " + doublonCount + " doublons");
	}
	
}
