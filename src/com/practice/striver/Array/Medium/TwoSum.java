package com.practice.striver.Array.Medium;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 18;

		int[] arr1 = twoSum(arr, target);
		for (int i : arr1) {
			System.out.print(i + " ");
		}

	}

	// Method 1: Brute force
	// Take two for loops, i and j, add them and compare them with target,
	// If equal to target, add the respective elements into the result array
	// return result array

	/*
	private static int[] twoSum(int[] arr, int target) {
		int[] result = new int[2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					result[0] = arr[i];
					result[1] = arr[j];
					break;
				}
			}
		}
		return result;
	}
	*/
	
	// Method1: Using HashMap
	// We will create a hashmap and check if target-arr element present inside it or not
	// If it is present, then will add index in new result array and return it
	// else add element into the map
	
	private static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				result[0] = map.get(target - arr[i]);
				result[1] = i;
				return result;
			}
			map.put(arr[i], i);
		}
		return result;
	}
}
