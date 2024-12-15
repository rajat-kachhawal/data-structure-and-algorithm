package com.practice.striver.Basic_Recursion;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 44, 11, 54 };
		int l = 0;
		int r = arr.length-1;
		reverseArray(arr, l, r);
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
	public static void reverseArray(int [] arr, int l, int r) {
		
		if(l >= r) {
			return ;
		}
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		l++;
		r--;
		reverseArray(arr, l, r);
	}

}
