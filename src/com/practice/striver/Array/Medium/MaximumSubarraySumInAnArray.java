package com.practice.striver.Array.Medium;

public class MaximumSubarraySumInAnArray {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		// Method 1: Brute force: Using 3 for loop
		// Time complexity: O(n3)
		// Space Complexity: O(1)
		
		// We will take three for loop: Outer loop from i--->n-1
		// Inner loop: i--->n-1
		// Inner's Inner: i--->j (To calculate sum of each individual sub array)
		// We wil calculate the sum first, if sum > max, we will store the maximum sum of the sub array in the max and store i and j value in the start and end
	
		/*int max = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum+=arr[k];
					if(sum > max) {
						max = sum;
						start = i;
						end = j;
					}
				}
			}
		}
		System.out.println("max sum: " + max + " " + start + " "+ end);
		*/
		
		// Method 2: Using 2 for loops
		// We can remove Inner's inner loop and follow the same process as mentioned in the Method 1
		/*
		int max = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = i; j < arr.length; j++) {
					sum+=arr[j];
					if(sum > max) {
						max = sum;
						start = i;
						end = j;
					}
			}
		}
		System.out.println("max sum: " + max + " " + start + " "+ end);
		
		*/
		
		//Method 3: Kadane's algorithm
		// Time complexity: O(n)
		// Space Complexity: O(1)
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		if (max < 0) {
			System.out.println("Return empty sub array");
		}
		System.out.println("Max sum: " + max);
	}
}
