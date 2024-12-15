package com.practice.striver.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayByKElement {

	private static final String List = null;

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 6, 8, 9, 10 };

		// Brute force: O(n2)
/*		int k = 2;
		for (int i = 0; i < k; i++) {
			int x = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = x;
		}
		for (int i : arr) {
			System.out.print(" " + i);
		}*/
		
		// Brute force 2:
		
//		int d = 17;
//
//		d = d % arr.length;
//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < d; i++) {
//			list.add(arr[i]);
//		}
//
//		for (int i = 3; i < arr.length; i++) {
//			arr[i - d] = arr[i];
//		}
//		int j = 0;
//		for (int i = arr.length - d; i < arr.length; i++) {
//			arr[i] = list.get(j);
//			j++;
//		}
//
//		for (Integer integer : arr) {
//			System.out.print(" " + integer);
//		}
		
		// Optimal approach:
		// Right Rotate
		// In first step, reverse whole array[0 to arr.length-1]
		// In next step, reverse initial k elements[0 to k-1] 
		// In last step, reverse remaining elements[from k-->arr.length-1]

		int k = 3;
		// Step 1:
		// reverse whole array
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		// step 2;
		// reverse from 0-->k-1
		int i = 0;
		int j = k - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		// Step 3
		// reverse remaining array
		int l = k;
		int m = arr.length-1;
		while (l < m) {
			int temp = arr[l];
			arr[l] = arr[m];
			arr[m] = temp;
			l++;
			m--;
		}
		for (int p : arr) {
			System.out.print(" " + p);
		}
	}
}
