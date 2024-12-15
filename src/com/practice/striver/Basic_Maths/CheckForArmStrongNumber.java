package com.practice.striver.Basic_Maths;

public class CheckForArmStrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int a = n;
		int sum = 0;
		int mod = 0;

		while (n != 0) {
			mod = n % 10;
			sum += mod * mod * mod;
			n = n / 10;
		}
		if (sum == a) {
			System.out.println("Is ArmStrong");
		} else
			{System.out.println("Is NOT Armstrong");}
		System.out.println(sum);
	}
}