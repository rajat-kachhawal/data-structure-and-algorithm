package com.practice.striver.Array.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInAnArray {

	public static void main(String[] args) {
		// Problem Statement: You are given an array of ‘N’ integers. You need to find
		// the length of the longest sequence which contains the consecutive elements.
		
		// Input: [100, 200, 1, 3, 2, 4]
		//Output: 4
		//Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.
		//Input: [3, 8, 5, 7, 6]
		//Output: 4
		//Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.
		
		int[] arr = { 100, 200, 1, 3, 2, 4 };
		int longest = 1;
		Set<Integer> set = new HashSet<>();

		for (Integer integer : arr) {
			set.add(integer);
		}

		for (Integer integer : set) {
			if (!set.contains(integer - 1)) {
				int count = 1;
				int x = integer;
				while (set.contains(x + 1)) {
					x = x + 1;
					count = count + 1;
				}
				longest = Math.max(longest, count);
			}
		}
		System.out.println("Longest: " + longest);
	}
}
