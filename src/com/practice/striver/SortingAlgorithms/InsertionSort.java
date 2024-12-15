package com.practice.striver.SortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// Insertion sort takes an element and place it at it's correct position
		// Build the sorted array in a gradually increasing manner by repeatedly taking
		// elements from the unsorted part and inserting them into their correct
		// position in the sorted part.
		/*
		 * Pick an element from array - Find its right place in the line. - Use a loop
		 * to shift other elements and make space. - Keep doing this until all elements
		 * are in order.
		 */

		int[] arr = { 2, 4, 44, 11, 54 };
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
}
