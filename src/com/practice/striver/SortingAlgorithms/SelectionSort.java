package com.practice.striver.SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 44, 11, 54 };

		// Logic:
		// In each iteration, find the minimum element from the unsorted part of the
		// array and swap it with the first element of the unsorted part.
		
		// Step 1: Get the minimum from the entire array and place at the first position
		// STep 2: Swap the element

		// We will consider a min_index at which array element is minimum and compare it
		// with other elements
		// if any element from remaining array is less than the current min element,
		// we will update the min_index with that element's index and swap elements
		// For more info, check this article:
		// https://www.geeksforgeeks.org/selection-sort/
		for (int i = 0; i < arr.length - 2; i++) {
			int min_index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
}
