package com.practice.striver.Basic_Recursion;

public class SnippetTwo {

	public static void main(String[] args) {
		int a = 100;
		int b = 2000;
		int c = test(a,b);
		System.out.println(c);
		System.out.println("AA"+2000%100);

	}
	private static int test(int a, int b) {
		if(b==0) {
			return b;
		}
		return test(b, a%b);
	}
}
