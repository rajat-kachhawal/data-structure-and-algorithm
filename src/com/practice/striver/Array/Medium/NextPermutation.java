package com.practice.striver.Array.Medium;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };

        // Step 1: Find the break-point
        int index = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Find the smallest element greater than the element at the break-point
            int nextGreaterIndex = index + 1;
            for (int i = arr.length - 1; i > index; i--) {
                if (arr[i] > arr[index] && arr[i] < arr[nextGreaterIndex]) {
                    nextGreaterIndex = i;
                }
            }

            // Swap the elements at break-point and next greater index
            int temp = arr[index];
            arr[index] = arr[nextGreaterIndex];
            arr[nextGreaterIndex] = temp;

            // Reverse the suffix starting from the break-point
            int left = index + 1;
            int right = arr.length - 1;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        } else {
            // If no break-point is found, reverse the whole array
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the result
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
