package vehicules;

public class Execution {
	
	public static void main(String [] args) {
		
		Motorise [] vehicules = new Motorise [3];
		vehicules[0] = new VeloElectrique();
		vehicules[1] = new Voiture();
		vehicules[2] = new Moto();
		
		for(Motorise v : vehicules) {
			v.allumerMoteur();
			v.accelerer();
			v.freiner();
			v.eteindreMoteur();
			
		}
		
	}

	
	
}
