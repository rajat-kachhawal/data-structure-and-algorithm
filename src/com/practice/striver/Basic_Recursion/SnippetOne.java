package com.practice.striver.Basic_Recursion;

public class SnippetOne {

	public static void main(String[] args) {
		int n = 6;
		int output = test(n);
		System.out.println(output);
	}

	private static int test(int n) {
		if (n <= 1) {
			return n;
		}
		return test(n - 1) + test(n - 2);
	}
}
