package com.demo;

import java.util.Scanner;

public class Exercice8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		String mot = a.nextLine();
		
		CharSequence c = "c";
		boolean res = mot.contains(c);
		if (res) {
			System.out.println("lettre presente");
		} else {
			System.out.println("lettre non presente");

		}
	}
}
