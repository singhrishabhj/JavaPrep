// Question:
// The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.
// Note: the function Math.abs(num) computes the absolute value of a number.
// 
// love6(6, 4) → true
// love6(4, 5) → false
// love6(1, 5) → true

// Solution:
public boolean love6(int a, int b) {
  if (a==6 || b==6 || a+b ==6 || a-b==6 || b-a==6){
    return true;
  }else {
    return false;
  }
}

// Alternative Solution:
public boolean love6Alternative(int a, int b) {
  return (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6);
}

// Explanation:
// The problem is checking if the number 6 is present in different ways:
// 1. If either of the two numbers is 6, return true.
// 2. If the sum of the two numbers is 6, return true.
// 3. If the difference of the two numbers (either way) is 6, return true.
// 4. The difference is checked both as a - b and b - a to ensure no negative values interfere.
// The Math.abs() method is not used in the first solution but is used in the alternative solution to simplify the difference check.
