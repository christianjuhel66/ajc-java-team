package com.agence.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupagePierre implements Decoupage {

	@Override
	public String decoupageDeMateriaux() {
		return "Je decoupe de la pierre";

	}

}
