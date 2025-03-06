//special-11
// We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
// Return true if the given non-negative number is special. Use the % "mod" operator.

// Examples:
// specialEleven(22) → true
// specialEleven(23) → true
// specialEleven(24) → false

public class SpecialEleven {

    // Method to check if a number is special
    public static boolean specialEleven(int n) {
        // Check if n is divisible by 11 or one more than a multiple of 11
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println("Test Case 1: " + specialEleven(22)); // true
        System.out.println("Test Case 2: " + specialEleven(23)); // true
        System.out.println("Test Case 3: " + specialEleven(24)); // false
        System.out.println("Test Case 4: " + specialEleven(11)); // true
        System.out.println("Test Case 5: " + specialEleven(12)); // true
    }
}

// Explanation:
// 1. The % operator checks the remainder of dividing n by 11.
// 2. If the remainder is 0, the number is divisible by 11.
// 3. If the remainder is 1, the number is one more than a multiple of 11.
// 4. The method returns true in both cases, otherwise false.
