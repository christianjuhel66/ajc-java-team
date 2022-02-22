package vehicules;

public class Voiture extends Vehicule implements Motorise{
	
	public Voiture() {
		super(4, 5);
	}
	
	public void accelerer() {
		System.out.println("J'utilise la p�dale d'accelerateur");
	}
	
	public void freiner() {
		System.out.println("J'utilise la p�dale de frein");
	}
	
	public void allumerMoteur() {
		System.out.println("Je mets le contact et j'utilise le starter");
	}


}
