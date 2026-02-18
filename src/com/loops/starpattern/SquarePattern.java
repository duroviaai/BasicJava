package com.loops.starpattern;

public class SquarePattern {
	public static void main(String[] args) {
		int n = 5;
		int space = -1, star = 7;

		for(int row = 1; row <= n; row++) {
			if(row <= 3) {
				space++;
				star -= 2;
				for(int i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				for(int i = 1; i <= star; i++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				space--;
				star += 2;
				for(int i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				for(int i = 1; i <= star; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
