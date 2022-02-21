package com.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupagePlaco implements Decoupage {

	@Override
	public String decoupageMateriel() {

		return "Je découpe des plaques de plâtre";
	}

}
