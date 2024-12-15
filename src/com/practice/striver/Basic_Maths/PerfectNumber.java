package com.practice.striver.Basic_Maths;

public class PerfectNumber {

	// Method:
	// Let's consider number 6. Its factors are 1, 2, 3 and 6 itself
	// Sum of 1+2+3(exclude 6 itself) == 6 then it is a prime number
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i < n; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += j; // This will give total sum of factors including the NUMBER itself, Hence remove
								// number from sum
				}
			}
			if (sum - i == i) {
				System.out.println(i);
			}
		}
	}
}
