package ajc.exercice;

public class Exercice {

	public static void main(String[] args) {
		
		//Cr�ez un programme java qui prenne en param�tre une variable 
		//de type int et qui retourne cette l'�quivalent converti en Integer

		int i = getRandom();
		System.out.println(transform(i).getClass());
	}

	// recupere un random
	private static int getRandom() {
		return (int) (Math.random()*(2000-1)+1);
	}

	// transforme en Integer
	private static Integer transform(int i) {
		return (Integer) i;
	}
}
