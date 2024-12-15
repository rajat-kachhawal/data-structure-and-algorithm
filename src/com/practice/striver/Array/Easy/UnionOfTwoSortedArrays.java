package com.practice.striver.Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 2, 3, 4, 4, 5, 6 };

		// Union of the two arrays removes duplicates and includes all unique elements
		// from both arrays.

		// Brute force 1:
		// TIME COMPLEXITY: O( (m+n)
		// SPACE COMPLEXITY: O(m+n)
		
		// Inserting a key in map takes logN times, where N is no of elements in map. At max map can store m+n elements 
		// {when there are no common elements and elements in arr,arr2 are distntict}.
		// Upon approximation across insertion of all elements in worst it would take O((m+n).
		
		// Take a map and fill each array element one by one Then print the keys		
		
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < arr1.length; i++) {
//			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
//		}
//		List<Integer> list = new ArrayList<>();
//		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
//			System.out.print(m.getKey() + " ");
//		}

		
		// Brute force 2
		// Time complexity:  O( (m+n)log(m+n) )
		// Space Complexity: O(m+n)
		// Take a set(specially LinkedHashSet as it maintains order)
		// Put all the array element one by one and then print the value
		
//		HashSet<Integer> set = new LinkedHashSet<>();
//		for (int i : arr1) {
//			set.add(i);
//		}
//		for (int i : arr2) {
//			set.add(i);
//		}
//		int length = set.size();
//
//		int[] result = new int[length];
//		int k = 0;
//		for (int i : set) {
//			result[k] = i;
//			k++;
//		}
//
//		for (int i : result) {
//			System.out.print(" " + i);
//		}
//		
		
		
		
		//Optimal
		// Time Complexity: O(m+n), Because at max i runs for n times and j runs for m times. When there are no common elements in arr1 and arr2 and all elements in arr1, arr2 are distinct. 
		// Space Complexity : O(m+n)
		
		// We will use two pointers i and j as 0
		// will first compare if arr1[i] < arr2[j] or not. If YES then will put arr1[i] into a list but there is a
		// catch that in union duplicate elements are not allowed so we need to put  condition for the same as well
		// if list is empty then there is no issue but if last inserted element present in the list is equal to the 
		// upcoming element, then we have to skip the element and increase the pointer
		
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
					list.add(arr1[i]);
				}
				i++;
			} else {
				if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
					list.add(arr2[j]);
				}
				j++;
			}
		}

		while (i < arr1.length) {
			if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
				list.add(arr1[i]);
			}
			i++;
		}

		while (j < arr2.length) {
			if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
				list.add(arr2[j]);
			}
			j++;
		}

		System.out.println(list);
	}
}
