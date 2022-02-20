package main;

public final class Exo9 { //le mot final indique que les variables contenant l'objet Exo9 feront reference au meme objet. 
	private static Exo9 SINGLETON; //Le singleton
	
	private Exo9() {}; //le constructeur par défaut est privé ce qui empeche de créer la classe Exo9 via cette méthode. 
						//Si il y a d'autre constructeurs il faut qu'ils soient aussi privé
	
	public static Exo9 getInstance() {
		if (SINGLETON == null) { //On ne crée la classe Exo9 que si elle n'existe pas.
			SINGLETON = new Exo9();
		}
		return SINGLETON; 
	}
	
	
}