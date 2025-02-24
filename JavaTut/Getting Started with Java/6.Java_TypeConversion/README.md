# Java Type Conversion

## Introduction
Welcome! In this lesson, we'll learn how to convert one data type into another in Java. Sometimes, we need to change a number type (like `int` to `double`) or convert between numbers and text. Understanding type conversion helps avoid errors and makes our programs more flexible.

---

## Automatic (Implicit) Conversion
Java automatically converts a smaller data type into a larger one when needed. This is called **implicit conversion** (or **widening**), and it happens without data loss.

### Example:
```java
int i = 10;  // Integer value
double d = i;  // Automatically converted to double
System.out.println("The value of d: " + d);   // Output: The value of d: 10.0
```
Since `double` can store larger values than `int`, Java does the conversion without any extra code.

---

## Manual (Explicit) Conversion
When converting a **larger type** into a **smaller one** (like `double` to `int`), we must do it manually using **casting**. This is called **explicit conversion** (or **narrowing**), and it may cause data loss.

### Example:
```java
double d = 10.25;
int i = (int) d;  // Manually casting double to int
System.out.println("The value of i: " + i);  // Output: The value of i: 10
```
> **Note:** The decimal part is removed when converting from `double` to `int`.

---

## Converting Numbers to Strings
We often need to convert numbers to text for display purposes. Java provides built-in methods for this:

### Example:
```java
int number = 10;
String text = Integer.toString(number);
System.out.println("The value of text: " + text);  // Output: The value of text: 10
```
Similarly, we can convert other data types using:
- `Double.toString(d)` for `double`
- `Float.toString(f)` for `float`

---

## Converting Strings to Numbers
If we have a number stored as text, we can convert it back to a number using methods like `Integer.parseInt()`.

### Example:
```java
String numberText = "25";
int num = Integer.parseInt(numberText);
System.out.println("The value of num: " + num);  // Output: The value of num: 25
```
> **Warning:** If the string contains non-numeric characters (e.g., `"25abc"`), trying to convert it will cause an error!

---

## Lesson Recap & Next Steps

### What You've Learned:
- **Implicit conversion** happens automatically when going from smaller to larger types.
- **Explicit conversion** (casting) is required when converting larger types to smaller ones.
- **Converting numbers to strings** helps in displaying information.
- **Converting strings to numbers** allows mathematical operations on user input.

### Next Steps:
In the next lesson, we’ll explore **Java Decision Making** and how to control the flow of programs using conditions. Keep practicing and coding! 🚀

