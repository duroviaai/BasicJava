package com.StaticMethods;

public class ReverseNumbers {
    public static void main(String[] args) {
        reverse(1239, 0);
    }

    private static void reverse(int i, int sum) {
        while (i > 0) {
            int rem = i % 10;        // get last digit
            sum = (sum * 10) + rem;  // build reversed number
            i = i / 10;              // remove last digit
        }
        System.out.println(sum);     // print reversed number
    }
}
