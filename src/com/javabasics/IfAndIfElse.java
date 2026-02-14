package com.javabasics;

public class IfAndIfElse {
	public static void main(String[] args) {
		int money = 101;
		if(money >= 100) {
			System.out.println("Watch movie have");
		}
		
		int drivingAge = 20;
		
		if(drivingAge >= 18 && drivingAge <= 62) {
			System.out.println("Eligible for driving license");
		} else {
			System.out.println("Not eligible for license");
		}
		
		System.out.println("========================================================");
		int range = 33;
		
		if(range >= 22 && range <= 32) {
			System.out.println("In Range");
		} else {
			System.out.println("Not in Range");
		}
	}
}
