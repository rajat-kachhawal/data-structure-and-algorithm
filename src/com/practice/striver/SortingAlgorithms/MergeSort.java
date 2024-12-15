package com.practice.striver.SortingAlgorithms;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 44, 11, 54 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if (low == high)
			return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>(); // temporary array

		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
		int i = low;
		for (Integer integer : temp) {
			arr[i] = integer;
			i++;
		}
	}
}
