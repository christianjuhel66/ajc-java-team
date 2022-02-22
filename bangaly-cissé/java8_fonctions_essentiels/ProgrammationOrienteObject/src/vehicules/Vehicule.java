package vehicules;

public abstract class Vehicule {
	
	protected int nbRoue;
	protected int nbPassager;
	protected String proprietaire;
	
	public Vehicule(int nbRoue, int nbPassager) {
		this.nbRoue = nbRoue;
		this.nbPassager = nbPassager;
	}
	
	public abstract void accelerer();
	public abstract void freiner();
	public void presentation() {
		System.out.println(
				"j'appartiens à " + this.proprietaire
				+ " j'ai " + this.nbRoue + " roues" +
				" et je peux contenir " + this.nbPassager + " passager(s)."
			);
		
	}
	
	
	
	
	

}
