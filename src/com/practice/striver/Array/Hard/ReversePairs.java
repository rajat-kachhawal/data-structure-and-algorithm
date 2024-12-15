package com.practice.striver.Array.Hard;

public class ReversePairs {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 3, 1 };

		// Problem Statement: Given an array of numbers, you need to return the count of reverse pairs. Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j]
			
			// Method 1: Brute force
			// Using two for loop: take a counter and apply required condition. If condition occurs, increase counter of it
			// Time complexity: o(n2)
		/*	int counter = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i < j && arr[i] > 2 * arr[j]) {
						counter++;
					}
				}
			}
			System.out.println("No of pairs: " + counter);	*/
	}
}
