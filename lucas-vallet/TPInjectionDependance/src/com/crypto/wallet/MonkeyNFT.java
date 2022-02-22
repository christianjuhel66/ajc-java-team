package com.crypto.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("monkeyNFT") 
public class MonkeyNFT implements NFT {
	
	//On demande à spring d'initialiser LinkedItem en tant que son implementation "MonkeyPicture"
	@Autowired
	@Qualifier("monkey")
	private LinkedItem item = new MonkeyPicture();

	@Override
	public String getBlockchain() {
		return "here's the ledger, good sir";
	}

	@Override
	public String getLinkedItem() {
		
		return item.getItem();
	}

}
