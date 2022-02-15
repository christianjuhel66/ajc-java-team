package artisan.ajc.entities;

import org.springframework.stereotype.Component;

@Component
public class Menuisier implements Artisan {

	private PrepareDevis devis;
	
	public Menuisier(PrepareDevis devis) {
		this.devis = devis;
	}
	
	@Override
	public String decouper() {
		return "Je découpe du bois avec mes scies";
	}

	@Override
	public String faireDevis() {
		return devis.faireDevis();
	}
}
