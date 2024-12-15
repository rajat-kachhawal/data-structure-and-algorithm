package com.practice.striver.Basic_Recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(printFibo(n));
	}

	private static int  printFibo(int n) {
		if(n <= 1)
			return n;
		return printFibo(n-1)+printFibo(n-2);
	}
}
