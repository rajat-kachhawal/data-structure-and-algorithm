package com.practice.striver.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySign {

	public static void main(String[] args) {
		// Problem Statement:
		// There’s an array ‘A’ of size ‘N’ with an equal number of positive and
		// negative elements. Without altering the relative order of positive and
		// negative elements, you must return an array of alternately positive and
		// negative values.
		// Note: Start the array with positive elements.
		// Eg:
		// Input:
		//	arr[] = {1,2,-4,-5}, N = 4
		//	Output:
		//	1 -4 2 -5

		int[] arr = { 1, 2, -4, -5 };
//		List<Integer> posList = new ArrayList<>();
//		List<Integer> negList = new ArrayList<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 0) {
//				posList.add(arr[i]);
//			} else {
//				negList.add(arr[i]);
//			}
//		}
//		System.out.println("Pos List : " + posList);
//		System.out.println("Neg List : " + negList);
//		
//		
//		for (int i = 0; i < arr.length / 2; i++) {
//				arr[2 * i] = posList.get(i);
//				arr[2 * i + 1] = negList.get(i);
//		}
//		for (Integer i : arr) {
//			System.out.print(" " + i);
//		}
		
		// Optimal approach:
		
		int [] result = new int [arr.length];
		int positiveIndex = 0; 
		int negativeIndex = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				result[negativeIndex] = arr[i];
				negativeIndex += 2;
			}else {
				result[positiveIndex] = arr[i];
				positiveIndex += 2;
			}
		}
		for (int i : result) {
			System.out.print(" " + i);
		}
	}
}
