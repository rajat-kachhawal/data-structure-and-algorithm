package com.practice.striver.Basic_Maths;

public class CountDigit {

	public static void main(String[] args) {
		int n = 210;
		int count = 0;
		
		//Method 1:
		// Divide by 10 and increment counter
/*		while(n!=0) {
			n = n/10;
			count++;
		}
		System.out.println(count);*/
		
		//Method2:
		// Convert int---> String
		String str = Integer.toString(n);
		System.out.println(str.length());
	}

}
