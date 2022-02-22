package collections;

import java.util.ArrayList;
import java.util.List;

public class ConstructionListe {

	public static void main(String[] args) {
		
		List<Integer> nombres = new ArrayList<Integer>();
		
		//a) Ajouter tous les nombres de 1 jusqu'à 100 dans la liste
		
		for(int i = 1; i<= 100; i++) {
			nombres.add(i);
		}
		
		//b) Afficher tous les éléments de la liste
		
		/*for(Integer i : nombres) {
			System.out.println(i);
		}*/
		
		
		//c) Retirer tous les multiples de 5 de la liste. 
		
		for(int i = 0; i < nombres.size(); i++) {
			if (nombres.get(i) % 5 == 0) {
				nombres.remove(i);
			}
		}
		
		// d) Afficher tous les éléments de la liste, avec leur index.
		
		for(int i = 0; i < nombres.size(); i++) {
			System.out.println( i + " : " + nombres.get(i));
		}
		
		

	}

}
