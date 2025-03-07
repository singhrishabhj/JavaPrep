// Topic: Array Reversal

// Question:
// Given an array of integers, reverse the elements of the array in-place.
// Write a method to reverse the array using two pointers (start and end) and swap the elements.

// Problem Explanation:
// You are given an array of integers. The goal is to reverse the elements of the array
// without using any additional array. To do this, we can use two pointers:
// - One pointer starting from the beginning of the array (index 0).
// - Another pointer starting from the end of the array (last index).
// These two pointers move toward each other, and their elements are swapped until the pointers meet in the middle.

// Approach:
// 1. Initialize two pointers: one at the start (index 0) and the other at the end (index n-1) of the array.
// 2. Swap the elements at these two pointers.
// 3. Move the start pointer to the right and the end pointer to the left.
// 4. Repeat the process until the start pointer crosses the end pointer.

// Solution:
import java.util.Scanner;

class ReverseAnArray {
    public static void main(String[] args) {
        // Creating a scanner object to take input from the user
        Scanner scn = new Scanner(System.in);

        // Reading the size of the array from the user
        int n = scn.nextInt();
        int[] arr = new int[n];  // Declaring an array of size 'n'

        // Reading array elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Calling the reverse method to reverse the array
        reverse(arr);

        // Printing the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  // Printing each element of the reversed array
        }
    }

    // Method to reverse the array
    public static void reverse(int[] arr) {
        int n = arr.length;  // Length of the array
        int st = 0;  // Starting pointer (index 0)
        int en = n - 1;  // Ending pointer (index n-1)
        int temp;  // Temporary variable to hold a value during the swap

        // Loop to swap elements from both ends of the array
        while (st < en) {
            temp = arr[st];  // Store the value at the start
            arr[st] = arr[en];  // Assign the value at the end to the start
            arr[en] = temp;  // Assign the stored start value to the end

            st++;  // Move the start pointer to the right
            en--;  // Move the end pointer to the left
        }
    }
}

// Sample Input and Output:

// Input:
// 5
// 1 2 3 4 5

// Output:
// 5 4 3 2 1
