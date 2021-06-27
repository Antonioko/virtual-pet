package com.company;

public class Main {

    public static void main(String[] args) {
	cat felix = new cat("orange");
	System.out.println("Felix's happyness is "+felix.getHappynes());System.out.println("Felix's hunger is "+felix.getHunger());
	for(int i = 0; i<6; i++){
		felix.feed();
		System.out.println("Felix's hunger is "+felix.getHunger());
	}


	felix.pet();
	System.out.println("Felix's happyness is "+felix.getHappynes());
	System.out.println("Felixs's color is "+ felix.color);
    }
}
