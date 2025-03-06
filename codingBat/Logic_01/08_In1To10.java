// Question:
// Given a number n, return true if n is in the range 1..10, inclusive.
// Unless outsideMode is true, in which case return true if the number is less or equal to 1,
// or greater or equal to 10.

// Examples:
// in1To10(5, false) → true
// in1To10(11, false) → false
// in1To10(11, true) → true

public class In1To10 {

    // Method to check the number based on outsideMode condition
    public static boolean in1To10(int n, boolean outsideMode) {
        // If outsideMode is true, return true for numbers <= 1 or >= 10
        if (outsideMode) {
            return (n <= 1 || n >= 10);
        } 
        // If outsideMode is false, return true for numbers between 1 and 10 (inclusive)
        else {
            return (n >= 1 && n <= 10);
        }
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println("Test Case 1: " + in1To10(5, false));  // true
        System.out.println("Test Case 2: " + in1To10(11, false)); // false
        System.out.println("Test Case 3: " + in1To10(11, true));  // true
        System.out.println("Test Case 4: " + in1To10(1, true));   // true
        System.out.println("Test Case 5: " + in1To10(2, true));   // false
    }
}

// Explanation:
// 1. If outsideMode is true, the function will return true only if the number is <= 1 or >= 10.
// 2. If outsideMode is false, the function will return true if the number is between 1 and 10.
// 3. This solution uses simple if-else conditions to check both cases.
