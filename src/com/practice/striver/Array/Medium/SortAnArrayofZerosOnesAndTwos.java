package com.practice.striver.Array.Medium;

public class SortAnArrayofZerosOnesAndTwos {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0, 2 };

		// NOTE: Can not use inbuilt methods
		// Below one is normal sorting which is not at all expected
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i : arr) {
//			System.out.print(" " + i);
//		}

		
		
		
//		int count_0 = 0;
//
//		int count_1 = 0;
//
//		int count_2 = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				count_0++;
//			} else if (arr[i] == 1) {
//				count_1++;
//			} else
//				count_2++;
//		}
//		int k = 0;
//
//		for (int i = 0; i < count_0; i++) {
//			arr[k] = 0;
//			k++;
//		}
//		for (int i = 0; i < count_1; i++) {
//			arr[k] = 1;
//			k++;
//		}
//		for (int i = 0; i < count_2; i++) {
//			arr[k] = 2;
//			k++;
//		}
//		for (int i : arr) {
//			System.out.print(" " + i);
//		}

	
		
		// Optimal solution; Dutch national flag algorithm
		
//		arr[0….low-1] contains 0. [Extreme left part]
//		arr[low….mid-1] contains 1.
//		arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
		
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp1 = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp1;
				high--;
			}
		}
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
}
