package com.practice.striver.Basic_Maths;

public class ReverseANumber {

	public static void main(String[] args) {
		int n = 12345;
		int reverse = 0;
		while (n != 0) {
			int a = n % 10;
			reverse = reverse * 10 + a;
			n = n / 10;
		}
		System.out.println("Reverse: " + reverse);
	}
}
