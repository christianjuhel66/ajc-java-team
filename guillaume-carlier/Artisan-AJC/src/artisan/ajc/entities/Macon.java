package artisan.ajc.entities;

import org.springframework.stereotype.Component;

@Component
public class Macon implements Artisan {

	private PrepareDevis devis;
	
	public Macon(PrepareDevis devis) {
		this.devis = devis;
	}
	
	@Override
	public String decouper() {
		return "Je d�coupe pas je ma�onne!";
	}
	
	@Override
	public String faireDevis() {
		return devis.faireDevis();
	}
}

