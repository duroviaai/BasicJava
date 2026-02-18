package com.loops.starpattern;

public class Arrows {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			System.out.println();
			if(i <= n/2) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
				}
			for(int j = 1; j <= i; j++) {
				System.out.print("I");
				}
			} else {
			for(int j = i; j <= n; j++) {
				System.out.print("*");
				}
			}
		}
	}

}
