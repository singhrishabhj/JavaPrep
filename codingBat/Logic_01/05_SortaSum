// Question:
// Given 2 ints, a and b, return their sum.
// However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
//
// Examples:
// sortaSum(3, 4) → 7
// sortaSum(9, 4) → 20
// sortaSum(10, 11) → 21

public class SortaSum {

    // Solution:
    // This method calculates the sum of two integers with a forbidden range check.
    // Parameters:
    // a: First integer.
    // b: Second integer.
    //
    // Explanation:
    // 1. The sum of a and b is stored in variable `c`.
    // 2. If the sum falls in the range of 10 to 19 (inclusive), the method returns 20.
    // 3. Otherwise, the method returns the original sum.
    public static int sortaSum(int a, int b) {
        int c = a + b; // Calculate the sum
        if (c >= 10 && c <= 19) {
            return 20; // Return 20 if the sum is in the forbidden range
        } else {
            return c; // Return the original sum otherwise
        }
    }

    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));  // 7
        System.out.println(sortaSum(9, 4));  // 20
        System.out.println(sortaSum(10, 11)); // 21
    }
}

