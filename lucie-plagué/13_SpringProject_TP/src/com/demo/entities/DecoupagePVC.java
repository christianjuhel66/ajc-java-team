package com.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class DecoupagePVC implements Decoupage {

	@Override
	public String decoupageMateriel() {

		return "Je découpe des tuyaux en PVC";
	}

}
