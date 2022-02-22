package vehicules;

public class Moto extends Vehicule implements Motorise{
	
	public Moto() {
		super(2, 2);

	}
	
	public void accelerer() {
		System.out.println("J'appuie sur la pédale");
	}
	
	public void freiner() {
		System.out.println("J'appuie sur la pédale de frein");
	}
	
	public void allumerMoteur() {
		System.out.println("Je mets le contact");
	}

}
