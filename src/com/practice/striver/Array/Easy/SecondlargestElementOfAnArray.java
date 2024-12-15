package com.practice.striver.Array.Easy;

import java.util.Arrays;

public class SecondlargestElementOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 6, 8, 8, 8, 4, 8, 8 };

		// Method 1: Brute force
		// TIME COMPLEXITY: O(NlogN)		// for sorting the array
		// SPACE COMPLEXITY: O(1)
		
		// We will sort the array using Collections.sort()
		// In sorrted array, we will start iteration from the last element of the array
		// and
		// check if second last element is same as the last element or not
		// if it is same, then we will iterate further
		// else we will print the value
		
/*		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			if(!(arr[i] == arr[i-1])) {
				System.out.println("2nd Last: "+arr[i-1]);
				break;
			}
		}*/

		
		// Method 2: Optimal Method
		//TIME COMPLEXITY: O(N)
		// SPACE COMPLEXITY: O(1)
		
		// We will take two variables as LARGEST and SECOND_LERGEST and initialize them
				// with Integer.Min_VALUE
				// (Can't initialize as 0 as there might be 0 or negative present inside the
				// array)
				// We will iterate thru the array and check if arr[i] > LARGEST
				// if YES then we will assign LARGEST as arr[i] and SECOND_LERGEST as LARGEST
				// if NO then we will check another condition as if arr[i] > SECOND_LERGEST && arr[i] != LARGEST, assign SECOND_LERGEST as arr[i]

		int SECOND_LERGEST = Integer.MIN_VALUE;
		int LARGEST = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > LARGEST) {
				SECOND_LERGEST = LARGEST;
				LARGEST = arr[i];
			}
			if(arr[i] > SECOND_LERGEST && arr[i] != LARGEST) {
				SECOND_LERGEST = arr[i];
			}
		}
			System.out.println("SECOND_LERGEST: "+SECOND_LERGEST);
	}
}