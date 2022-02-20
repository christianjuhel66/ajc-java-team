package main;

import java.util.ArrayList;
import java.util.List;

public class Exo7 {
	static MotUnique mu = new MotUnique();
	
	public static void main(String[] args) {
		mu.ajoutMot("Poisson");
		mu.ajoutMot("Viande");
		mu.ajoutMot("Fruit");
		mu.ajoutMot("Poisson");
		mu.supprimeMot("Poisson");
		mu.ajoutMot("Poisson");
		mu.listMots();
	}
	
	static class MotUnique{
		List<String> mots = new ArrayList<String>();
		
		public void supprimeMot(String s) {
			this.mots.remove(s);
		}
		
		public void ajoutMot(String s) {
			if (mots.contains(s)) {
				System.out.println("Le mot " + s + " est déja present dans la classe");
			}
			else this.mots.add(s);
		}
		
		public void listMots() {
			System.out.println(this.mots);
		}
	}
	
	
}
