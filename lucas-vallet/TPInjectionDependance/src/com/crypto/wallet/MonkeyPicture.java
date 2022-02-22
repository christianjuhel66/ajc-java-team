package com.crypto.wallet;

import org.springframework.stereotype.Component;

@Component("monkey") //permet a spring d'ajouter cette classe à l'application context en tant que beans
public class MonkeyPicture implements LinkedItem {
	
	private String description = "a ugly monkey";

	@Override
	public String getItem() {
		return description;
	}

}
