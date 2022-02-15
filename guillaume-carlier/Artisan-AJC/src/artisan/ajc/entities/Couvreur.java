package artisan.ajc.entities;

import org.springframework.stereotype.Component;

@Component
public class Couvreur implements Artisan {
	
	private PrepareDevis devis;
		
	public Couvreur(PrepareDevis devis) {
		this.devis = devis;
	}
		
	@Override
	public String decouper() {
		return "Je découpe des ardoises pour la toiture";
	}
	
	@Override
	public String faireDevis() {
		return devis.faireDevis();
	}
}
