package com.loops.starpattern;

public class Arrows {
	public static void main(String[] args) {
		int n = 9;
		for(int i = 1; i <= n; i++) {
			System.out.println();
			if(i <= n/2) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
				}
			} else {
			for(int j = i; j <= n; j++) {
				System.out.print("*");
				}
			}
		}
	}

}
