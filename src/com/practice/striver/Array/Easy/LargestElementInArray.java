package com.practice.striver.Array.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestElementInArray{

	public static void main(String[] args) {
		int[] arr = { 2, 52, 11, 66, 23, 45 };

		// Method 1
		// TIME COMPLEXITY: O(n log n)
		// SPACE COMPLEXITY: O(1)
		
		// We can use inbuilt method Arrays.sort(arr) to sort the array first.
		// The largest element will be present at the last index so we will get arr[arr.length-1]th element
		
		/*Arrays.sort(arr);	//Internally Arrays.sort() uses Tim sort method
		System.out.println("Largest is: " + arr[arr.length - 1]);*/

		// Method 2
		// Time Complexity: O(N)
		// Space Complexity: O(1)
		
		// First we will assume that 0th element is the largest one
		// Then, in the next step, we will iterate thru the array one by one and compare each elements with the maximum one
		// if the maximum element is < than the iterating element, then change maximum to the iterating one
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max: " + max);
	}
}