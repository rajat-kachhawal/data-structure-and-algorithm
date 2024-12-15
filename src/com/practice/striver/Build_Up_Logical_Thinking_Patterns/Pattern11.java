package com.practice.striver.Build_Up_Logical_Thinking_Patterns;

public class Pattern11 {

	public static void main(String[] args) {
		/*
		 		1
				01
				101
				0101
				10101
				010101 
		 */
		int n = 6;
		int start;
		for (int i = 0; i < n; i++) {
			if(i%2!=0) {
				start = 0;
			}else {
				start = 1;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1-start;
			}
			System.out.println();
		}
	}
}
