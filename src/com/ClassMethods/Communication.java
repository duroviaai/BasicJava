package com.ClassMethods;

public class Communication {
	public static void main(String[] args) {
		Communication.call("Anushka", "Karthikeya");
		Communication.call("Rashmika", "Srujan");
	}

	private static void call(String heroine, String hero) {
		System.out.println("Heroine " + heroine + " is continously talking on mobile with hero " + hero);
	}
}
