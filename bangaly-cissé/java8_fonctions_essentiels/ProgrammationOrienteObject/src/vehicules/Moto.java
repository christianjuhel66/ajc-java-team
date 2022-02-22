package vehicules;

public class Moto extends Vehicule implements Motorise{
	
	public Moto() {
		super(2, 2);

	}
	
	public void accelerer() {
		System.out.println("J'appuie sur la p�dale");
	}
	
	public void freiner() {
		System.out.println("J'appuie sur la p�dale de frein");
	}
	
	public void allumerMoteur() {
		System.out.println("Je mets le contact");
	}

}
