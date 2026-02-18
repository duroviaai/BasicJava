package com.StaticMethods;

public class StrongNumber {
	public static void main(String[] args) {
		int given = 145;
		boolean check = checkStrongNo(given);
		
		if(check)
			System.out.println("Given no : " + given + " is strong");
		else
			System.out.println("Not a strong number");
	}

	private static boolean checkStrongNo(int given) {
		int temp = given;      // store original number
		int output = 0;        // must start from 0
		
		while(temp > 0 ) {
			int remainder = temp % 10;
			int fact = factorial(remainder);
			System.out.println("Factorial of " + remainder + " = " + fact);
			
			output = output + fact;
			temp = temp / 10;
		}
		
		return output == given;   // compare properly
	}

	private static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
