package com.practice.striver.Array.Easy;

import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 6, 8, 10, 10 };

		// Method 1:
		// Declare a HashSet.
		// Run a for loop from starting to the end.
		// Put every element of the array in the set.
		// Store size of the set in a variable K.
		// Now put all elements of the set in the array from the starting of the array.
		// Return k;

		
//		HashSet<Integer> set = new HashSet();
//
//		for (int i : arr) {
//			set.add(i);
//		}
//		int sizeOfSet = set.size();
//		int[] result = new int[sizeOfSet];
//
//		int j = 0;
//		for (Integer i : set) {
//			result[j] = i;
//			j++;
//		}
//		for (int i : result) {
//			System.out.print(" " + i);
//		}

		// Method2:
		// We will use two pointer approach over here
		// Will take two pointers i and j
		// We will assign i = 0 and will iterate thru array using variable j
		// if arr[i] != arr[j] this happens, we will insert arr[j] at the next location
		// of i
		// then we will print the array from 0 to i only

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		for (int m = 0; m < i; m++) {
			System.out.print(" " + arr[m]);
		}
	}
}
