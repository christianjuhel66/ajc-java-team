package com.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupagePlaco implements Decoupage {

	@Override
	public String decoupageMateriel() {

		return "Je d�coupe des plaques de pl�tre";
	}

}
