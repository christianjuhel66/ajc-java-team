package com.demo.entity;

public class ImplDecoupageMateriaux implements DecoupageMateriaux {

	@Override
	public String decoupe() {
		return "je decoupe du bois";
	}
}
