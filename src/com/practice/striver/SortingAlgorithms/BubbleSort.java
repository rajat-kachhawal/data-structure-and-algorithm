package com.practice.striver.SortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		

		// Concept: Push the maximum to the last by adjacent swapping OR
		// Repeatedly swap adjacent elements if they are in the wrong order.
		// We will first take initial two components and compare them
		// Next will swap them if arr[i]>arr[i+1] else continue
		// 
		int[] arr = { 2, 4, 44, 11, 54 };
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for (int i : arr) {
			System.out.print( " "+ i);
		}
	}

}
