package com.agencedetravaux.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupageCable implements Decoupage {

	@Override
	public String decoupageDeMateriaux() {
		return "Je decoupe un câble";

	}

}