package com.ClassMethods;

public class GetFactorial {
	public static void main(String[] args) {
		GetFactorial.Fact(5);
	}

	private static void Fact(int n) {
		int prod = 1;
		if(n <= 1) 
			return ;
		else
			for(int i = 1; i <= n; i++) {
				prod = prod * i;
				}
		System.out.println("Factorial of " + n + " = " + prod);
		}
	}