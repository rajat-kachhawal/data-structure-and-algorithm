package com.practice.striver.Basic_Recursion;

public class PrintOneToNUsingRecursion {
	static int count = 1;

	public static void main(String[] args) {
		printNumber(25);
	}

	private static void printNumber(int i) {
		if (count > i) {
			return;
		} else {
			System.out.println(count);
			count++;
			printNumber(i--);
		}
	}
}
