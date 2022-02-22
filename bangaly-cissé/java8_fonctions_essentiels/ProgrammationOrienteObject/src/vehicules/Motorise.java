package vehicules;

public interface Motorise {
	
	public void allumerMoteur();
	
	default public void eteindreMoteur() {
		System.out.println("Je couple le moteur");
	}

	public void accelerer();

	public void freiner();

}
