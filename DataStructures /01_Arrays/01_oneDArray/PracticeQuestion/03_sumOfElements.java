// Topic: Sum of Elements in an Array

// Question:
// Given an array of integers, calculate the sum of all the elements in the array.
// Write a method to compute the sum by iterating through the array.

// Problem Explanation:
// You are given an array of integers, and the task is to calculate the sum of all its elements.
// This can be done by iterating over the array and adding each element to a cumulative sum variable.

// Approach:
// 1. Initialize a variable to hold the sum (initially set to 0).
// 2. Loop through the array and add each element to the sum variable.
// 3. After the loop completes, print the final sum.

// Solution:
import java.util.Scanner;

class SumOfElements {
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

        // Calling the sum method to calculate the sum of array elements
        int result = sum(arr);

        // Printing the sum of elements
        System.out.println("The sum of elements is: " + result);
    }

    // Method to calculate the sum of array elements
    public static int sum(int[] arr) {
        int n = arr.length;  // Length of the array
        int sum = 0;  // Initialize sum to 0

        // Loop to calculate the sum by iterating through the array
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];  // Add each element to the sum
        }
        return sum;  // Return the calculated sum
    }
}

// Sample Input and Output:

// Input1:
// 5
// 1 2 3 4 5

// Output1:
// The sum of elements is: 15

// Input2:
// 6
// 1 3 5 7 9 11

// Output2:
// The sum of elements is: 36
