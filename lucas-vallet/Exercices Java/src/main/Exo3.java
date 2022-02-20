package main;

import java.util.Random;

public class Exo3 {

	public static void main(String[] args) {
		int[] arrayInt = new int[15];
		initializeArray(arrayInt);
		 for (int i = 0; i < arrayInt.length; i++) {
			 System.out.println(arrayInt[i]);
		 }
	}
	
	public static void initializeArray(int[] arrayInt) {
		Random rd = new Random();
		for (int i = 0; i < arrayInt.length; i++) {
	        arrayInt[i] = rd.nextInt(1, 11); 
	     }
	}

}
