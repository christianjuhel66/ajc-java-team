package com.crypto.wallet;

import org.springframework.stereotype.Component;

@Component("cybershoes") //permet a spring d'ajouter cette classe à l'application context en tant que bean
public class Cybershoes implements LinkedItem{
	
	private String description = "virtual randomized shoes";

	@Override
	public String getItem() {
		return description;
	}

}
