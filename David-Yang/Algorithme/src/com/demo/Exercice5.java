package com.demo;

public class Exercice5 {

	public static Integer convertInttoInte(int a)
	
	{
		Integer iInteger = Integer.valueOf(a);
		return iInteger;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		Integer b = convertInttoInte(x);
		System.out.print(b);
	}

}
