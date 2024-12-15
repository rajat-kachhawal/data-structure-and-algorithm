package com.practice.striver.Array.Easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheMissingNumberInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5 };
		int n = 5;

		// Method 1: Brute force: Time Complexity O(n2)
		//  TIME COMPLEXITY O(n2)
		// SPACE COMPLEXITY O(1)
		// we will do a linear search for each element starting from i = 0 to i = n in
		// the array and set flag as true if element is found
		//

		
//		for (int i = 1; i <= n; i++) {
//			boolean flag = false;
//			for (int j = 0; j < arr.length; j++) {
//				if (i == arr[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if (!flag) {
//				System.out.println("Missing: " + i);
//			}
//		} 

		// Method 2: Better method: 
		// Time Complexity O(n)+O(n)
		// Space complexity O(n)
		
		// Using hashing
		// In this method we will take a hash array of size n+1 as array starts with 1
		// Now, for each element in the given array, we will store the frequency in the
		// hash array.
		// After that, for each number between 1 to N, we will check the frequencies.
		// And for any number, if the frequency is 0, we will return it.
		
//		int[] hash = new int[n];
//		for (int i = 0; i < arr.length - 1; i++) {
//			hash[arr[i]]++;
//		}
//
//		// Find and print the missing element
//		for (int i = 1; i <= n; i++) {
//			if (hash[i] == 0) {
//				System.out.println("Missing: " + i);
//				break;
//			}
//		}
		
		// Method 3: Optimal 1
		// Time complexity O(1)
		// Space complexity: O(1)
		// We will add all the starting from 1 to N and subtract actual sum
		// This will give us the missing element

		
//		int sum = n * (n + 1) / 2;
//
//		int actualSum = 0;
//		for (int i : arr) {
//			actualSum += i;
//		}
//		System.out.println("Missing number : " + (sum - actualSum)); 
		
		
		
		// Method 4: Optimal 2: Using XOR
		// Time complexity: O(1)
		// Space complexity: O(1)
		// Two important properties of XOR are the following:

		// XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
		// XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.
		// ←Property 2

		// Now, let’s XOR all the numbers between 1 to N.
		// xor1 = 1^2^…….^N

		// Let’s XOR all the numbers in the given array.
		// xor2 = 1^2^……^N (contains all the numbers except the missing one).

		// Now, if we again perform XOR between xor1 and xor2, we will get:
		// xor1 ^ xor2 = (1^1)^(2^2)^……..^(missing Number)^…..^(N^N)

		// Here all the numbers except the missing number will form a pair and each pair
		// will result in 0 according to the XOR property. The result will be = 0 ^
		// (missing number) = missing number (according to property 2).
		
		int xor1 = 0;
		int xor2 = 0;
		for (int i = 1; i <= n; i++) {
			xor1 = i ^ xor1;
		}
		for (int i = 0; i < arr.length; i++) {
			xor2 = arr[i] ^ xor2;
		}
		System.out.println(xor1 ^ xor2);
	}
}
