package com.artisan.entity;

import org.springframework.stereotype.Component;

@Component
public class TaillerPierre implements Tailler{

	@Override
	public String taillerMateriau() {
		return "Je taille une pierre";
	}

}
