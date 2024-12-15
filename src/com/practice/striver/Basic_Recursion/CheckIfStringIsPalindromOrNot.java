package com.practice.striver.Basic_Recursion;

public class CheckIfStringIsPalindromOrNot {

	public static void main(String[] args) {
		String str = "racecar";
		char[] chArray = str.toCharArray();
		int l = 0;
		int r = chArray.length-1;
		checkPalindrom(chArray, l, r);
		String str1 = new String(chArray);
		System.out.println(str.equals(str1));

	}

	private static void checkPalindrom(char[] chArray, int l, int r) {

		if (l >= r)
			return;
		char temp = chArray[l];
		chArray[l] = chArray[r];
		chArray[r] = temp;
		
		l++;
		r--;
		checkPalindrom(chArray, l, r);
	}

}
