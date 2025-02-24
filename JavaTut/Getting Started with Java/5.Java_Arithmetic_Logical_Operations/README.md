# Java Arithmetic and Logical Operators

## Introduction
In this lesson, we will learn about arithmetic and logical operations in Java. These operations help us perform calculations and make decisions in our programs. Understanding these concepts is essential for working with data in Java.

---

## Arithmetic Operators
Arithmetic operators allow us to perform basic mathematical calculations like addition, subtraction, multiplication, division, and modulus (which gives the remainder of a division).

### Example:
```java
int a = 10;
int b = 2;
System.out.println(a + b); // Output: 12
System.out.println(a - b); // Output: 8
System.out.println(a * b); // Output: 20
System.out.println(a / b); // Output: 5
System.out.println(a % b); // Output: 0
```
- `+` adds two numbers
- `-` subtracts one number from another
- `*` multiplies two numbers
- `/` divides one number by another
- `%` gives the remainder of a division

---

## Logical Operators
Logical operators are used to make decisions based on conditions. They return either `true` or `false`.

### Logical Operators in Java ( `&&`, `||`, and, `!`)
- `&&` (AND) – Returns `true` if **both** conditions are true.
- `||` (OR) – Returns `true` if **at least one** condition is true.
- `!` (NOT) – Reverses a boolean value (true becomes false, and vice versa).

### Example:
```java
System.out.println(true && true);  // true
System.out.println(true && false); // false
System.out.println(false || true); // true
System.out.println(false || false); // false
System.out.println(!true); // false
System.out.println(!false); // true
```

We can also use logical operators with variables:
```java
int speed = 60;
int minSpeed = 30;
int maxSpeed = 70;
System.out.println(speed > minSpeed && speed < maxSpeed); // Output: true
```
Here, we check if `speed` is within the allowed range using the `&&` operator.

---

## Overflow in Java
Overflow happens when a number is too large for its data type to handle. For example, if an `int` exceeds its maximum value, it wraps around to the minimum value.

### Example:
```java
int maxInt = Integer.MAX_VALUE; // Maximum integer value (2^31 - 1)
int overflow = maxInt + 1; // Causes overflow
System.out.println(overflow); // Output: -2147483648 (Minimum int value, -2^31)
```
Here, adding 1 to the maximum `int` value causes it to overflow to the smallest possible `int` value.
> **Note:** When an `int` overflows, it wraps around to the smallest possible value.
---

## Lesson Recap & Next Steps

### What You've Learned:
1. Arithmetic operations (`+`, `-`, `*`, `/`, `%`)
2. Logical operations (`&&`, `||`, `!`)
3. How to use these operators with variables
4. Integer overflow and its effects

### Next Steps:
In the next lesson, we will explore **Java Type Conversion** and how to handle different data types effectively. Keep coding and experimenting! 🚀


