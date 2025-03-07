// Topic: Find the Maximum and Minimum Element in an Array

// Question:
// Given an array of integers, find and print the maximum and minimum element in the array.
// The input consists of an integer n (size of the array) followed by n integers representing the elements of the array.
// The output should be the maximum and minimum element in the array.

// Solution Explanation:
// The problem is asking to find the maximum and minimum elements in an array.
// We initialize the maximum and minimum to the first element of the array.
// Then we iterate through the array and update the maximum or minimum value if a larger or smaller element is found respectively.
// Finally, we print the maximum and minimum values.

//Solution:
import java.util.Scanner;

class findMaxAndMin {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();  // Read the size of the array
       int[] arr = new int[n];  // Initialize the array
      
       // Reading the array elements
       for (int i = 0; i < n; i++) {
           arr[i] = scn.nextInt();  // Input elements of the array
       }
       
       // Finding the maximum and minimum values
       int max = max(arr);  
       int min = min(arr);
       
       // Printing the results
       System.out.println("The maximum element in the array is: " + max);
       System.out.println("The minimum element in the array is: " + min);
    }
    
    // Method to find the maximum element
    public static int max(int[] arr) {
        int max = arr[0];  // Initialize max with the first element
        for (int i = 1; i < arr.length; i++) {  // Start iteration from the second element
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger element is found
            }
        }
        return max;  // Return the maximum value
    }
    
    // Method to find the minimum element
    public static int min(int[] arr) {
        int min = arr[0];  // Initialize min with the first element
        for (int i = 1; i < arr.length; i++) {  // Start iteration from the second element
            if (arr[i] < min) {
                min = arr[i];  // Update min if a smaller element is found
            }
        }
        return min;  // Return the minimum value
    }
}

// Input:
// The first input is the number of elements in the array.
// The next set of inputs are the array elements, which are integers.

// Example Input:
// 5
// 2 7 1 9 3

// Output:
// The maximum element in the array is: 9
// The minimum element in the array is: 1
