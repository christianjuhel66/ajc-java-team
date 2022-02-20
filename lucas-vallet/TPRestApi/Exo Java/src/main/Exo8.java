package main;

public class Exo8 {
	public static void main(String[] args) {
		String s = "Grandmot";
		char c1 = 'b';
		char c2 = 'a';
		if(checkForLetters(s, c1)) {
			System.out.println("la premiere lettre est bien dans le mot");
		}
		else {
			System.out.println("la premiere lettre n'est pas dans le mot");
		}
		if(checkForLetters(s, c2)) {
			System.out.println("la seconde lettre est bien dans le mot");
		}
		else {
			System.out.println("la seconde lettre n'est pas dans le mot");
		}
	}
	
	public static boolean checkForLetters(String s, char cToCheck) {
		for(char c: s.toCharArray()) {
			if (c == cToCheck) return true;
		}
		return false;
	}
}
