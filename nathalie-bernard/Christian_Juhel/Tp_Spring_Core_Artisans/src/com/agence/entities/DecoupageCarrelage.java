package com.agence.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupageCarrelage implements Decoupage {

	@Override
	public String decoupageDeMateriaux() {
		return "Je découpe du carrelage";
	}

}
