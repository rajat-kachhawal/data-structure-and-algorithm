package com.practice.striver.Array.Medium;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };

		// Brute Force:
		// Time Complexity: O(n2)
		// Space Complexity: O(1)
		// We will take two pointers i and j
		// As a common sense ith day will be the day in which we will buy the stock and
		// jth day would be in which we will sell the stockk
		// i will always be less than j
		// We will first take arr[i] and compare it with all right side element, if any
		// element present in right side is > arr[i], we will calculate profit
		// arr[j] - arr[i]. If this difference > maximum, we will update maximum
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] > arr[i]) {
//					if (arr[j] - arr[i] > max) {
//						max = arr[j] - arr[i];
//					}
//				}
//			}
//		}
//		System.out.println("Max profit: " + max);
		
		// https://takeuforward.org/data-structure/stock-buy-and-sell/
		int profit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
				minPrice = Math.min(minPrice, arr[i]);
				profit = Math.max(profit, arr[i] - minPrice);
		}
		System.out.println("Max profit: " + profit);
	}

}
