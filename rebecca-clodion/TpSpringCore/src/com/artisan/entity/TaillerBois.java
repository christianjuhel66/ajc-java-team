package com.artisan.entity;

import org.springframework.stereotype.Component;

@Component
public class TaillerBois implements Tailler{

	@Override
	public String taillerMateriau() {
		return "Je taille du bois";
	}

}
