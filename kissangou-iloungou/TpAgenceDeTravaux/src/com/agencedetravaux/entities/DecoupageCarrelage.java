package com.agencedetravaux.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupageCarrelage implements Decoupage {

	@Override
	public String decoupageDeMateriaux() {
		return "Je d�coupe du carrelage";
	}

}
