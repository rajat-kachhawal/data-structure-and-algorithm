package com.practice.striver.Basic_Recursion;

public class PrintNameNTimes {

	static int count = 0;

	public static void main(String[] args) {
		printName("Cybage Software", 10);

	}

	private static void printName(String name, int i) {

		if (count == 10) {
			return;
		}else
			System.out.println(name);
		count++;
		printName(name, count);
	}
}
