package com.javabasics;

public class BasicLoop {

	public static void main(String[] args) {
//		int a = 1;
//		while(a < 4) {
//			System.out.println(a++);
//		}
//		int b = 4;
//		do {
//			System.out.println("b : " +b);
//			b++;
//		}while(b < 4);
		
		int n = 9;
		for(int i = 1; i <= n; i++) {
			System.out.println();
			for(int j = 1; j <= n; j++) {
			System.out.print("*");
			}
		}
		System.out.println("====================");
		for(int i = 1; i <= n; i++) {
			System.out.println();
			for(int j = i; j >= 1; j--) {
			System.out.print("*");
			}
		}
	}
}