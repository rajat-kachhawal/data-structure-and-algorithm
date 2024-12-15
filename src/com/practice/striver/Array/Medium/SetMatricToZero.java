package com.practice.striver.Array.Medium;

public class SetMatricToZero {

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int m = arr.length;
        int n = arr[0].length;
        
// 		Method 1: Brute force        
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 0) {
//                    markRow(arr, i, n);
//                    markColumn(arr, j, m);
//                }
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == -1) {
//                    arr[i][j] = 0;
//                }
//                System.out.print(" " + arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    private static void markColumn(int[][] arr, int j, int m) {
//        for (int i = 0; i < m; i++) {
//            arr[i][j] = -1;
//        }
//    }
//
//    private static void markRow(int[][] arr, int i, int n) {
//        for (int j = 0; j < n; j++) {
//            arr[i][j] = -1;
//        }
        
        // Method 2: 
		int[] row = new int[m];
		int[] col = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}
}
