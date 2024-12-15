package com.practice.striver.Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindtheMajorityElementthatoccursmorethanNby2Times {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 1, 2, 2 };

		// Method 1: Brute force
		// Time complexity: O(n2)
		// Space Complexity: O(1)
		// We will take two for loop and iterate thru the array
		// for each arr[i], we will find out it's frequency
		// if frequency is > n/2, we will print that element and break the loop
		
	/*	
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > arr.length / 2) {
				System.out.println("majority element is: " + arr[i] + " " + count);
				break;
			}
		}
	 	
	 	
	 	
	 	*/
		// Method 2: Better solution
		// Time Complexity: O(N*logN) + O(N), where N = size of the given array.
		// Reason: We are using a map data structure. Insertion in the map takes logN
		// time. And we are doing it for N elements. So, it results in the first term
		// O(N*logN). The second O(N) is for checking which element occurs more than
		// floor(N/2) times. If we use unordered_map instead, the first term will be
		// O(N) for the best and average case and for the worst case, it will be O(N2).
		// Space Complexity: O(N) as we are using a map data structure.
		
		/*HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > arr.length / 2) {
				System.out.println("majority element: " + m.getKey());
			}
		}*/
		
		
		// Method 3: Better Solution'
		// Time complexity: O(nlogn)
		// Space complexity: O(nlogn)
		// If order does not matter in the array, sort the array
		// Sorting the array would give us O(nlogn) time complexity
		// We can use inbuilt sort functions like Arrays.sort() or Collections.sort()
		// If already sorted, no need to do it
		// Whenever interviewer ask to use any space, it could be a Dp question or use HashMap(Used in above approach)


//		Arrays.sort(arr);
//		int counter = 1;
//		for(int i = 0; i < arr.length-1; i++) {
//			if(arr[i] == arr[i+1]) {
//				counter++;
//			} else {
//				counter = 1;
//			}
//			if (counter > arr.length / 2) {
//				System.out.println("Majority elementL: " + arr[i]);
//			}
//		}
//		

		
		
		
		//Method 4: Optimal Approach: Moore's algorithm
	   // Time Complexity: O(N) + O(N), where N = size of the given array.
		// Space  Complexity: O(1)
		// In Moore's algo, we will start iterate from the array and take two variables count and element
		// we will take starting element of array and store it in element variable
		// 
		
		/*Finding a Potential Majority Element:
		 * The first loop looks through a list of things (arr). We have two friends,
		 * count and element. If count is zero, it means we start considering a new
		 * potential majority element. If the current thing is the same as the current
		 * element, count goes up. If it's different, count goes down. At the end of
		 * this loop, element might be our potential majority thing. 
		 * 
		 * 
		 * Verifying the Majority Element:		 * 
		 * The second loop counts how many times our potential majority element shows up
		 * in the list. If it appears more than half the time, it's the real winner. The
		 * code then says, "Yes, indeed, the majority thing is: [the element]." In
		 * simpler terms, it's like counting votes for different things. First, we check
		 * which thing might be winning, and then we double-check to make sure it really
		 * is the winner by counting how many times it appears. If it's more than half
		 * the time, we say, "Yes, that's the most popular thing!"
		 */

		int count = 0;
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				element = arr[i];
				count = 1;
			} else if (arr[i] == element) {
				count++;
			} else
				count--;
		}

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				counter++;
			}
		}
		if (counter > arr.length / 2) {
			System.out.println("majority element is: " + element);
		}
	}
}
