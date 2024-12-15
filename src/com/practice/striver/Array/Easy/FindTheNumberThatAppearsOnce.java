package com.practice.striver.Array.Easy;

public class FindTheNumberThatAppearsOnce {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 2, 1, 2 };

		// Method 1: Brute force
		// TIME COMPLEXITY: O(n2)
		// SPACE COMPLEXITY: O(1)
		
		// We will do a liner search.
		// We will take a variable num in which we will store array element arr[i] and a
		// counter as 0
		// Then we will take another for lopp which will iterate thru the whole array
		// and if nums == arr[i], a counter will get increased
		// When counter == 1, we will print the value and break the loop
		
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			int counter = 0;
//
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == num) {
//					counter++;
//				}
//			}
//			if (counter == 1) {
//				System.out.println("Unique number is: " + arr[i]);
//			}
//		}
		
		
		
		
		
		// Method 2: Better approach 
		// Hashing USING array DATA STRUCTIRE
		// TIME COMPLEXITY O(n)
		// SPACE COMPLEXITY O(n)
		
//		int max = arr[0];
//		for (int i : arr) {
//			max = Math.max(max, i);
//		}
//
//		int[] hash = new int[max + 1];
//
//		for (int i = 0; i < arr.length; i++) {
//			hash[arr[i]]++;
//		}
//		for (int i = 0; i < hash.length; i++) {
//			if (hash[i] == 1) {
//				System.out.println("Number which appeaqrs once is : " + hash[i]);
//				break;
//			}
//		}
		
		// Method 3: Better approach
		// Using HashMap
		// TIME COMPLEXITY O(N*logM) + O(M),M = size of the map i.e. M = (N/2)+1. N =
		// size of the array.
		// Reason: We are inserting N elements in the map data structure and insertion
		// takes logM time(where M = size of the map). So this results in the first term
		// O(N*logM). The second term is to iterate the map and search the single
		// element.
		// In Java, HashMap generally takes O(1) time complexity for insertion and
		// search. In that case, the time complexity will be O(N) + O(M).

		// SPACE COMPLEXITY O(M)
		// We will store array elements as Key and their corresponding frequency as value
		// We will then print the keys  whose frequency is one 
		
		
		
		
		// Method 4: Optimal approach
		// Using XOR
		// TIME COMPLEXITY: O(n)
		// SPACE COMPLEXITY: O(1)
		
		// We will declare a xor variable
		// we know that num^num == 0 and num ^ 0 = num, so we will iterate abd xor each element
		// Then, the remaining element would be the one which has singl occurance
		
		int xor = 0;

		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		System.out.println("Number which appears once is: " + xor);
	}
}
