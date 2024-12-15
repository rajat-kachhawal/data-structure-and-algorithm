package com.practice.striver.Build_Up_Logical_Thinking_Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		/*
		  		1 2 3 4 5 6
				1 2 3 4 5
				1 2 3 4
				1 2 3
				1 2 
				1
		 */
		int n = 6;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}
