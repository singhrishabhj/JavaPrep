# Java Coding Challenge: Fix the Bug

## Problem Statement
You know errors in code are called bugs? Your mission is to find and fix a small bug in a Java program shown below. Ensure you check the code for correct Java syntax to guarantee its successful execution. Let's start by running the code.

## Objective
Fix the syntax error in the given Java program so it successfully prints:
```
Greetings, interstellar explorers!
```
to the console.

---

## Code to Fix
```java
class Solution {
    public static void main(String[] args) {
        // Sending a greeting to interstellar explorers
        System.out.println("Greetings, interstellar explorers!")
    }
}
```

---

## Solution
```java
class Solution {
    public static void main(String[] args) {
        // Sending a greeting to interstellar explorers
        System.out.println("Greetings, interstellar explorers!"); // Fixed syntax error
    }
}
```

---

## Explanation
- The original code was missing a semicolon (`;`) at the end of the `System.out.println` statement.
- Java requires each statement to end with a semicolon to avoid syntax errors.
- The corrected code now executes without errors and prints the intended message.

### Key Takeaways
- Every statement in Java must end with a semicolon.
- Fixing syntax errors is a fundamental debugging skill.
- Running the code and checking for errors helps in identifying mistakes.

Try fixing similar syntax errors and run the program again.

