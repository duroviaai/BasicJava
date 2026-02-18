package com.loops.starpattern;

public class HowerClockPattern {
	 public static void main(String[] args) {

	        int n = 5;

	        int mid = (n / 2) + 1;

	        for (int row = 1; row <= n; row++) {

	            int space, star;

	            if (row <= mid) {
	                space = row - 1;
	                star = n - (2 * space);
	            } else {
	                space = n - row;
	                star = n - (2 * space);
	            }

	            for (int i = 1; i <= space; i++)
	                System.out.print(" ");

	            for (int i = 1; i <= star; i++)
	                System.out.print("*");

	            System.out.println();
	        }
	    }
}
