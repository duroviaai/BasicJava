package com.loops.starpattern;

public class SquareMatrix {

		public static void main(String[] args) {	
			int n = 6;
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println("@");
			}
			System.out.println("\n================================");
			
			for(int i = 1; i <= n; i++) {
				System.out.println();
				for(int j = 1; j <= n; j++) {
				System.out.print("*");
				}
			}
			System.out.println("\n================================");
			for(int i = 1; i <= n; i++) {
				System.out.println();
				for(int j = i; j >= 1; j--) {
				System.out.print("*");
				}
			}
			System.out.println("\n================================");
			
			for(int i = 1; i <= n; i++) {
				System.out.println();
				for(int j = i; j <= n; j++) {
				System.out.print("*");
				}
			}
			System.out.println("\n================================");
			
			for(int i = 1; i <= n; i++) {
				System.out.println();
				for(int j = i; j <= n; j++) {
					System.out.print(" ");
					}
				for(int j = i; j >= 1; j--) {
				System.out.print(" *");
				}
			}
			System.out.println("\n================================");
			
			
			for(int i = 1; i <= n; i++) {
				System.out.println();
				for(int j = i; j >= 1; j--) {
				System.out.print("*");
				}
				for(int j = i; j < n; j++) {
					System.out.print("  ");
				}
				for(int j = i; j >= 1; j--) {
					System.out.print("*");
				}
			}
			for(int i = 1; i <= n; i++) {
				System.out.println();
				for(int j = i; j <= n; j++) {
					System.out.print("*");
				}
				for(int j = i; j > 1; j--) {
					System.out.print("  ");
				}
				for(int j = i; j <= n; j++) {
					System.out.print("*");
				}
				
			}
			
			
			System.out.println("\n================================");
			
			for(int i = 1; i <= n; i++) {
				System.out.println();
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
		}
			
			System.out.println("\n================================");
			
			for(int i = 1; i <= n; i++) {
				System.out.println();
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print("*");
			}
		}
	}

}
