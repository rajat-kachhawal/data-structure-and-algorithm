package com.practice.striver.Basic_Maths;

public class PrintAllDivisorsOfAGivenNumber {

	public static void main(String[] args) {
		int a = 120;

		// Method 1
		/*for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.print(i+" ");
			}
		}*/
		
		// Method 2
		// https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
		for(int i = 2; i <= (int)Math.sqrt(a);i++) {
			if(a%i == 0) {
				System.out.print(i+" ");
			}
			if(i != a/i) {
				System.out.print(a/i+" ");
			}
		}
	}

}
