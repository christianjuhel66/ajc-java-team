package com.agence.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupageBois implements Decoupage {

	@Override
	public String decoupageDeMateriaux() {
		return "Je découpe du bois";
	}

}
