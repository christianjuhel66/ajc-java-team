package com.agencedetravaux.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupageBois implements Decoupage {

	@Override
	public String decoupageDeMateriaux() {
		return "Je d�coupe du bois";
	}

}
