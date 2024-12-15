 package com.practice.striver.Array.Easy;

import java.util.HashMap;

public class LongestSubarrayWithGivenSumK {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 1, 9 };

		int n = 10;

		// Method 1: Brute force
		// Time complexity: O(n2)
		//Space Complexity: O(1)
//		int sum = 0;
//		int length = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				sum += arr[j];
//				if (sum == n) {
//					length = Math.max(length, j - i + 1);
//				}
//			}
//		}
//		System.out.println("Max subarray: " + length);
		

		// Method 2: Optimal approach
		// Using HashMap
		//			
		
		// Time Complexity: O(N) or O(N*logN) depending on which map data structure we are using, where N = size of the array.
		// Space Complexity: O(n) as we are using map data structure
		
		// |----------------------currentSum----------------|
		// <================================================>
		// |------currentSum-Sum-------|-------Sum----------|
		// We will use simple maths and will store element's sum one by one in hashmap with their index
		// For eg. a[0]-----> 0(index 0)
		// 		   a[0]+a[1]----->1(index 1)
		// For     a[0]+a[1]+a[2]---->2(index 2)
		//          . 
		//			.
		//			.
		//			.
		
		// We will store sum with their in Hashmap
		int sum = n;
		int start = 0;
		// if end = -1, no sum found condition is there
		int end = -1;
		int currentSum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			// This if condition is for special case where we will may get desired sum from
			// starting index 0
			if (currentSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}
			// If map.contains currentSum - sum, this means we have found the starting
			// location of sub array and ending location as well
			// How ending location? coz ending location pr hi sum available hoga
			if (map.containsKey(currentSum - sum)) {
				start = map.get(currentSum - sum) + 1;
				end = i;
				break;
			}
			map.put(currentSum, i);
		}

		if (end == -1) {
			System.out.println("Not found");
		} else
			System.out.println(start + " " + end);
	}
}
