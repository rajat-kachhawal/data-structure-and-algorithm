package com.practice.striver.Basic_Recursion;

public class PrintNToOneUsingRecursion {
	static int count = 1;

	public static void main(String[] args) {
		printReverseNumber(25);

	}

	private static void printReverseNumber(int i) {
		if (i == 0) {
			return;
		} else {
			System.out.println(i);
			i--;
			printReverseNumber(i);
		}
	}
}
