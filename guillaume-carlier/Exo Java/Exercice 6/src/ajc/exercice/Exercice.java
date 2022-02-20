package ajc.exercice;

public class Exercice {

	public static void main(String[] args) {
		
		//Créez un programme java qui prenne en paramètre une variable 
		//de type int et qui retourne cette l'équivalent converti en Integer

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
