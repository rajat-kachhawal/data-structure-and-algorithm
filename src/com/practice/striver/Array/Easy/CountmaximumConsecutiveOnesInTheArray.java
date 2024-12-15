package com.practice.striver.Array.Easy;

public class CountmaximumConsecutiveOnesInTheArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
		int count = 0;
		int max = 0;
		// Warm up problem
		// TIME COMPLEXITY: O(N)
		// SPACE COMPLEXITY: O(1)
		
		// We'll iterate from i = 0 to n 
		// In each iteration we will compare if arr[i] == 1 or not. If YES then we will increase the counter
		// We will take another variable max and update it if and only if when count > max
		// and when we hit other number than 1, we will set counter again to zero
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if(count >= max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println("Max occurance: " + max);
	}
}
