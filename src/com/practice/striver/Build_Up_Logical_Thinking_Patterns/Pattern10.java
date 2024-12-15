package com.practice.striver.Build_Up_Logical_Thinking_Patterns;

public class Pattern10 {

	public static void main(String[] args) {
			/*
					 *
				     **
				     *** 
				     ****
				     *****
				     ******  
				     *****
				     ****
				     ***    
				     **
				     * 
			 */
		
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}
		
		
	}

}
