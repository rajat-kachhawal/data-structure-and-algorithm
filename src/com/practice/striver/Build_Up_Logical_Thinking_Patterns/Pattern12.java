package com.practice.striver.Build_Up_Logical_Thinking_Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		int n = 4;
		int k = 10;
		
		/*
				     10 9 8 7
					 6 5 4
					 3 2
					 1
		 */
		
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j>0; j--) {
				System.out.print(" " + k--);
			}
			System.out.println();
		}
	}
}
