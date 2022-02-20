package com.crypto.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ftNFT") 
public class FTNFT implements NFT{
	
	//On demande à spring d'initialiser LinkedItem en tant que son implementation "FT"
	@Autowired
	@Qualifier("ft")
	private LinkedItem item;
	
	
	@Override
	public String getBlockchain() {
		return "here's the ledger, good sir";
	}

	@Override
	public String getLinkedItem() {
		return item.getItem();
	}

}
