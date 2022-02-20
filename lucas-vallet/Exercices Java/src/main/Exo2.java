package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exo2 {

	public static void main(String[] args) {
		Random rd = new Random(); 
	     int[] arr1 = new int[10];
	     int[] arr2 = new int[10];     
	     System.out.println("Premier tableau");
	     
	     for (int i = 0; i < arr1.length; i++) {
	        arr1[i] = rd.nextInt(0, 11); 
	        System.out.println(arr1[i]); 
	     }
	     
	     System.out.println("Second tableau");
	     for (int i = 0; i < arr2.length; i++) {
		        arr2[i] = rd.nextInt(0, 11); 
		        System.out.println(arr2[i]); 
		     }
	     //Recherche des nombres identiques
	     List<Integer> sameNumber = new ArrayList<Integer>();
	     for(int arr1Int: arr1) {
	    	 for(int arr2Int: arr2) {
	    		 if (arr1Int == arr2Int && !sameNumber.contains(arr1Int)) {
	    			 sameNumber.add(arr1Int);
	    		 }
	    	 }
	     }
	     System.out.println("Les deux tableaus ont " + sameNumber.size() + " valeurs identiques");
	     sameNumber.toString();
	    }     
	} 
