package com.practice.striver.Array.Easy;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 2 };
		
		// Method 1; Brute force
		// TIME COMPLEXITY: O(n2)
		// SPACE COMPLEXITY: O(1)

		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					flag = false;
				}
			}
		}

		if (flag == true) {
			System.out.println("Array is sorted");
		} else
			System.out.println("Not sorted");
		
		// Method 2: Optimal solution
		// Time complexity: O(n)
		// Space complexity: O(1)
		// We will iterate in the same array but instead of taking inner loop j, we will use the outer loop only to compare arr[i] < arr[i+1]
	/*	boolean b = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				continue;
			} else {
				b = false;
			}
		}
		if (b) {
			System.out.println("Array  sorted");

		} else
			System.out.println("Array not sorted");*/
	}
}
