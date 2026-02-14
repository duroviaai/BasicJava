package com.javabasics;

public class ElseIfLadder {
	public static void main(String[] args) {
		
		int age = 28;
		if(age >= 22 && age <= 32) {
			System.out.println("Eligible for Marriage");
		}
		else if(age < 22) {
			System.out.println("Have some patience come when you reach 22");
		} else {
			System.out.println("Yo hae lot of patience try your best");
		}
		
		System.out.println("========================================================");

		int range = 55;
		if(range >= 22 && range <= 32) {
			System.out.println("In the range.");
		}
		else if(age < 22) {
			System.out.println("Less than the range");
		} else {
			System.out.println("Out of range");
		}
	}
}