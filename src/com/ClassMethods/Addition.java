package com.ClassMethods;

public class Addition {
	public static void main(String[] args) {
		Addition.Add(1, 2, 3);
	}

	private static void Add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum of numbers = " + sum);
	}
}
