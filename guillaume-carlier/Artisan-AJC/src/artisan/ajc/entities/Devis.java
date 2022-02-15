package artisan.ajc.entities;

import org.springframework.stereotype.Component;

@Component
public class Devis implements PrepareDevis {

	@Override
	public String faireDevis() {
		return "Je prépare un devis";
	}

	
}
