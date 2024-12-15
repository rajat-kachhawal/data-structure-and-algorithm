package com.practice.striver.Array.Medium;

import java.util.ArrayList;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// Problem Statement: Given an array, print all the elements which are leaders.
		// A Leader is an element that is greater than all of the elements on its right
		// side in the array.
		
		//Method 1: Brute force
		// 
		
		int[] arr = { 10, 22, 12, 3, 0, 6 };
//
//		for (int i = 0; i < arr.length; i++) {
//			boolean flag = true;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					flag = false;
//				}
//			}
//			if (flag) {
//				System.out.println("Leader: " + arr[i]);
//			}
//		}
//			
		
		// Optimal solution: https://takeuforward.org/data-structure/leaders-in-an-array/	
		int max = Integer.MIN_VALUE;
		  ArrayList<Integer> list= new ArrayList<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
}
