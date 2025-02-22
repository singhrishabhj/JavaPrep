# Java Variables: Overview & Goal Setting

Welcome back! As we continue our **Java Journey to the Stars**, we're diving into **Java Variables**, our fundamental companions. Just like celestial objects light up the night sky, variables illuminate our code, making it more meaningful and dynamic.

## What Are Java Variables?
In simple terms, a **variable** is like a **box** in memory that holds a value. Let's explore how variables work in Java:

```java
int numberOfStars; // Declare a variable (a box for data)
numberOfStars = 88; // Assign a value to it
System.out.println(numberOfStars); // Output: 88
```

Here:
- `int` is the **data type** (integer).
- `numberOfStars` is the **variable name**.
- `88` is the **assigned value**.

We can also **declare and assign** a variable in a single step:

```java
int numberOfStars = 88; // Declare & assign in one line
System.out.println(numberOfStars);
```

## Java Naming Conventions
Naming variables properly ensures **readability** and avoids errors. Follow these conventions:

✅ **Correct Naming:**
```java
int myAge = 20;
int myWeight = 72;
int district9Population = 10000;
```

🚫 **Incorrect Naming (won't compile):**
```java
// int 0zero = 0; // Cannot start with a number
// int ?questionMark = 1; // Special characters are not allowed
```

### Rules for Naming Variables:
- Start with a **lowercase letter**.
- Use **camelCase** (e.g., `myAge`, `firstDayOfWeek`).
- Avoid using **digits** or **special characters** at the beginning.

## Assignment Operations in Java
The **`=` operator** is used to assign values to variables. Think of it as placing an item in a box.

```java
int constellations = 88; // Assign initial value
System.out.println(constellations); // Output: 88

constellations = 77; // Change the value
System.out.println(constellations); // Output: 77
```

## Java Constants
Sometimes, we need **values that never change**. Java provides the `final` keyword to create constants.

```java
final int DAYS_IN_WEEK = 7; // A constant (unchangeable value)
System.out.println(DAYS_IN_WEEK); // Output: 7

// DAYS_IN_WEEK = 6; //  This will not compile
```

### Why Use Constants?
- **Readability**: Easily understand fixed values.
- **Safety**: Prevent accidental changes.
- **Performance**: Some optimizations occur for constants.

## Lesson Recap & Next Steps
Great job! You've learned:
1. What Java variables are.
2. How to declare, assign, and update them.
3. Naming conventions for variables.
4. How to define constants using `final`.

Next, we'll **explore data types** in Java. Keep practicing, and let's continue our **Java Journey to the Stars!** 🚀

