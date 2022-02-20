package com.demo;

import java.util.Scanner;

public class BaniereBienvenue {
	/* 
	Ecrivez la procédure qui affiche la banière suivante 
	 ********************************************************************** 
	 **                                                                  ** 
	 **                      BIENVENUE  AUX JAVAISTES                    ** 
	 **                                                                  ** 
	 **********************************************************************  */
	
	String a = new String();
	
	public static void lesEtoiles(String a) {
		System.out.print(a);
	}
	
	public static void texte() {
		System.out.print("BIENVENUE  AUX JAVAISTES");
	}
	
	public static void espace() {
		System.out.print(" ");
	}
	
	public static void affichage(String a) {
		for (int i =0; i<2; i++) {
			lesEtoiles(a);
		}	
		for (int j=0; j<66; j++) {
				espace();
		}
		for (int i =0; i<2; i++) {
			lesEtoiles(a);
		}	
	}
	
	public static void affichage2(String a) {
		for (int i =0; i<2; i++) {
			lesEtoiles(a);
		}	
		for (int j=0; j<21; j++) {
				espace();
		}
		texte();		
		for (int j=0; j<21; j++) {
			espace();
		}
		for (int i =0; i<2; i++) {
			lesEtoiles(a);
		}	
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel symbole ?");
		String symbole = sc.next();
		for (int i=0; i<70; i++) {
			lesEtoiles(symbole);
		}
		System.out.println(" ");
		affichage(symbole);
		System.out.println(" ");
		affichage2(symbole);
		System.out.println(" ");
		affichage(symbole);
		System.out.println(" ");
		for (int i=0; i<70; i++) {
			lesEtoiles(symbole);
		}
	}

}
