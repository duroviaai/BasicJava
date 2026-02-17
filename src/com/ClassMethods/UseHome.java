package com.ClassMethods;

public class UseHome {
	public static void main(String[] args) {
		
		UseHome.kitchen();
		UseHome.DiningHall();
		UseHome.BedRoom();
	}

	private static void DiningHall() {
		System.out.println("Sleep and get recharged");
	}

	private static void kitchen() {
		System.out.println("Eat here and get the energy");
	}

	private static void BedRoom() {
		System.out.println("Prepare your favorite food");
	}
}
