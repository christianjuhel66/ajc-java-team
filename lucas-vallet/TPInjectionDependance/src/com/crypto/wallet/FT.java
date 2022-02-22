package com.crypto.wallet;

import org.springframework.stereotype.Component;

@Component("ft") //permet a spring d'ajouter cette classe à l'application context en tant que bean
public class FT implements LinkedItem {
	
	private String description = "non-fungible money?!?";

	@Override
	public String getItem() {
		return description;
	}

}
