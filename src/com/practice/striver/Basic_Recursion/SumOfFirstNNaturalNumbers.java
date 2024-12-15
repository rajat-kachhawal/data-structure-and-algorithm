package com.practice.striver.Basic_Recursion;

public class SumOfFirstNNaturalNumbers {
	static int count = 1;
	static int sum = 0;

	public static void main(String[] args) {
		sumOfFirstnIntegers(25);
	}

	private static void sumOfFirstnIntegers(int i) {
		if (count > 25) {
			System.out.println("Sum: " + sum);
			return;
		} else {
			sum += count;
			count++;
			sumOfFirstnIntegers(count);
		}
	}
}
