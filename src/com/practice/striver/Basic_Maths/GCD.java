package com.practice.striver.Basic_Maths;

public class GCD {

	public static void main(String[] args) {
		int a = 100;
		int b = 2000;
		/*int ans = 0;
		for (int i = 2; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				ans = i;
			}
		}
		System.out.println(ans);*/
		
		
		//Method2:
		// We'll use recursion
		int gcd = gcd(a, b);
		System.out.println("GCD: " + gcd);
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else
		return	gcd(b, a % b);
	}
}
