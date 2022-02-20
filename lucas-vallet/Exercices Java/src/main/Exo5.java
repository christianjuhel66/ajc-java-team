package main;

public class Exo5 {

	public static void main(String[] args) {
		int i = 3;
		Integer bigI = intToInteger(i);
	}
	
	public static Integer intToInteger(int x) {
		return Integer.valueOf(x);
	}

}
