# Java Conditional Statements

## Introduction
In Java, we use **conditional statements** to make decisions in our programs. These statements help control the flow of execution based on conditions, just like deciding whether to launch a spaceship or stay on Earth based on the weather. Let's explore `if`, `if-else`, `switch`, and the **ternary operator**.

---

## `if` and `if-else` Statements
The `if` statement runs code **only if a condition is true**.

### Example:
```java
int oxygenLevel = 78;
if (oxygenLevel > 20) {
    System.out.println("Planet has breathable air!");
}
```
If `oxygenLevel` is above 20, the message is printed.

The `if-else` statement provides an **alternative action** when the condition is false.

### Example:
```java
int oxygenLevel = 15;
if (oxygenLevel > 20) {
    System.out.println("Planet has breathable air!");
} else {
    System.out.println("Oxygen level too low!");
}
```
If `oxygenLevel` is **not** above 20, it prints "Oxygen level too low!".

---

## `else if` Statement (Multiple Conditions)
When checking multiple conditions, we use `else if`:

### Example:
```java
int oxygenLevel = 58;
if (oxygenLevel > 70) {
    System.out.println("Excellent Oxygen level!");
} else if (oxygenLevel > 50) {
    System.out.println("Oxygen level is acceptable.");
} else {
    System.out.println("Oxygen level is too low!");
}
```
The program stops checking conditions after the first true one.

---

## `switch` Statement (Multiple Choices)
When we have multiple possible values for a variable, `switch` is useful. Instead of multiple `if` statements, we use **cases**.

### Example:
```java
int planetNumber = 3;
switch (planetNumber) {
    case 1:
        System.out.println("Gearing up for Planet 1!");
        break;
    case 2:
        System.out.println("Preparing for Planet 2!");
        break;
    case 3:
        System.out.println("Get ready for Planet 3!");
        break;
    default:
        System.out.println("Resting at the spaceship.");
}
```
If `planetNumber` is **3**, it prints "Get ready for Planet 3!".

> **Note:** The `break` statement prevents executing other cases unintentionally.

---

## Ternary Operator (Shortcut for `if-else`)
The **ternary operator** is a compact way to write an `if-else` statement in one line.

### Syntax:
```java
result = condition ? value_if_true : value_if_false;
```

### Example:
```java
boolean detection = true;
String message = detection ? "Signal detected, safe to land!" : "No signal detected, abort mission!";
System.out.println(message);
```
If `detection` is **true**, it prints "Signal detected, safe to land!".

---

## Lesson Recap & Next Steps

### What You've Learned:
- **`if` and `if-else`** handle simple conditions.
- **`else if`** helps check multiple conditions.
- **`switch`** is great for multiple choices.
- **Ternary operator** provides a quick way to write `if-else` statements.

### Next Steps:
In the next lesson, we’ll explore **Java Loops**, which help repeat actions in a program. Keep coding and practicing! 🚀

