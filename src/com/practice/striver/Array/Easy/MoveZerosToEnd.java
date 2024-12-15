package com.practice.striver.Array.Easy;

import java.util.LinkedList;
import java.util.List;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 5, 0, 2, 0, 0, 6, 0, 4, 8, 11, 0 };

		// Brute force
		// Time Complexity O(n)
//		  LinkedList<Integer> list = new LinkedList<>();
//
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] == 0) {
//					list.addLast(arr[i]);
//				} else
//					list.addFirst(arr[i]);
//			}
		  
//			int[] result = new int[arr.length];
//			int j = 0;
//			for (int i : list) {
//				result[j] = i;
//				j++;
//			}
//			for (int i : result) {
//				System.out.print(" " + i);
//			}
		
		// Optimal Solution:
		// Complete solution: https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
}
