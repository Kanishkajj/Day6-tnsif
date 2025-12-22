package com.tnsif.Polymorphism;

class AnimalClass{
	void sound() {
		System.out.println("Animals can make sound");
	}
}


class Lion extends AnimalClass{
	void sound() {
		System.out.println("Lion roars......");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
	
		Lion ac = new Lion();
		ac.sound();
		
		
		/*
		 * Lion l = new Lion(); l.sound();
		 */
	}

}
