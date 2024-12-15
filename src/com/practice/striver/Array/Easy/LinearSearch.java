 package com.practice.striver.Array.Easy;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		int n = 8;

		// Time complexity: O(n)
		// Space Complexity: O(1)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("index: " + i);
				break;
			}
		}
	}
}
