package vehicules;

public class Velo  extends Vehicule{
	
	public Velo() {
		super(2, 1);

	}
	
	public void accelerer() {
		System.out.println("Je p�dale vite");
	}
	
	public void freiner() {
		System.out.println("Je prese le frein");
	}

}
