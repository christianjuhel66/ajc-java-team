package vehicules;

public class VeloElectrique extends Velo implements Motorise{
	
	@Override
	public void allumerMoteur() {
		System.out.println("Je mets sur ON");
	}
	

}
