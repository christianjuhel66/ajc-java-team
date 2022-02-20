package com.crypto.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crypto.wallet.NFT;

public class ApplicationExecution {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //On instancie les classes non pas par leur constructeurs mais en passant par l'application context de spring
		NFT monkey = context.getBean("monkeyNFT", NFT.class);
        NFT shoes = context.getBean("cybershoesNFT", NFT.class);
        NFT token = context.getBean("ftNFT", NFT.class);
        
        System.out.println(monkey.getBlockchain());
        System.out.println("For our first NFT we have " + monkey.getLinkedItem());

        System.out.println(shoes.getBlockchain());
        System.out.println("Our second NFT is " + shoes.getLinkedItem());
        
        System.out.println(token.getBlockchain());
        System.out.println("Our final NFT is " + token.getLinkedItem());

        context.close();

	}

}
