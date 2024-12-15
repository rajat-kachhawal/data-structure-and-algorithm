package com.practice.striver.Basic_Recursion;

public class factorialOfAGivenNumber {
    static int count = 1;
    static int fact = 1;

    public static void main(String[] args) {
        factorial(5);
    }

    private static void factorial(int i) {
        if (count > i) {
            System.out.println("Fact: " + fact);
            return;
        } else {
            fact = fact * count;
            count++;
            factorial(i); // Increment count after the recursive call
        }
    }
}
