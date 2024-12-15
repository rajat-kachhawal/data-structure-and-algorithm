package com.practice.striver.Array.Easy;

public class LeftRotateTheArrayByOne {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 6, 8, 10, 10 };

		// Brute force approach
		// Time Complexity: O(n), as we iterate through the array only once.
		// Space Complexity: O(n) 
		
		// We will take a temp []
		// Then, we will start filling elements from arr array starting from 1st element
		// At the last, we will store ar[0] in temp[arr.length-1]th place
/*		int[] temp = new int[arr.length];

		for (int i = 1; i < arr.length; i++) {
			temp[i - 1] = arr[i];
		}
		temp[arr.length - 1] = arr[0];

		for (int i : temp) {
			System.out.print(" " + i);
		}*/

		// Optimal approach:
		// Time Complexity: O(n), as we iterate through the array only once.
		// Space Complexity: O(1)
		
		// We will take a x variable in which we will store arr[0]
		// next, we will start iterating from i = 0 and replace ith element with (i+1)th
		// index
		// At last, we will assign x variable to the arr[arr.length-1]th place
		
		int x = arr[0];
		for(int i = 0; i < arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = x;
		

		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
}
