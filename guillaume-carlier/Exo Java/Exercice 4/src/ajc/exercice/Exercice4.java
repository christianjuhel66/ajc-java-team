package ajc.exercice;

public class Exercice4 {

	public static void main(String[] args) {
		/*
		 * EX 02 Rechercher des valeurs communes � deux tableaux 
		 *
			1)D�finir deux tableaux de10 �l�ments de type entier et les remplir 
		    avec des valeurs aleatoires comprises entre 1 et 10 
		    2) afficher le contenu de ces deux tableaux �l�ment par �l�ment
			3) calculer et afficher le nombre de valeurs communes � ces deux tableaux
			4) si une valeur est pr�sente dans les deux tableaux , et qu'elle est aussi
			pr�sente plusieurs fois dans l'un ou dans les deux tableaux , elle  n'est compt�e qu'une seule fois 
		 */
		
		// Declaration de deux tableaux
		Integer tab1[] = new Integer[10];
		Integer tab2[] = new Integer[10];
		
		// Instanciation des tab + affichage
		for (int i = 0; i < tab1.length; i++) {
			tab2[i] = getRandom();
			tab1[i] = getRandom();
			
			System.out.println(tab1[i] + " - " + tab2[i]);
		}
		
		// parcours du premier tab
		for (int j = 0; j < tab2.length; j++) {
			// r�cup�re le nombre d'occurence d'une valeur dans les tableaux
			int test = isPresent(j, tab2);
			int test2 = isPresent(j, tab1);
			
			//Si la valeur est pr�sente dans les deux tableaux, affiche le nombre d'occurence.
			if (test != 0 && test2 != 0) {
				System.out.println("la valeur " + j + " est pr�sente " + test2 
						+ " fois dans le tableau 1 et " + test + " fois dans le tableau 2.");
			}
		}
	}
	
	// fonction pour r�cuperer un chiffre al�atoire en 1 et 10
	public static Integer getRandom() {
		return (int) (Math.random()*(10-1)+1);
	}
	
	// fonction pour verifier la pr�sence des valeurs et retourne le nombre de fois ou elle est pr�sente
	public static int isPresent(Integer valeur, Integer[] tab) {
		int present = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == valeur) {
				present++;
			}
		}
		return present;
	}
}
