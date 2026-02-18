package com.instance;

class Bike {
	String brand;
	int speed;
	static int wheel = 2;
	
	void details() {
		System.out.println("Brand : " + brand + "\nSpeed : " + speed);
	}
}

public class UseBike {
	
	public static void main(String[] args) {
		
		System.out.println("Wheel : " + Bike.wheel);
		Bike bike = new Bike();
		bike.brand = "R15";
		bike.speed = 210;
		
		bike.details();
	}
}
