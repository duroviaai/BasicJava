package com.instance;

class Flower {
	String color;
	int petals;
	
	void purpose(String reason) {
		System.out.println("Color : " + color);
		System.out.println("Petals : " + petals);
		System.out.println(reason);
	}
}

public class UseFlower{
	public static void main(String[] args) {
		Flower f = new Flower();
		f.details()
	}
}
