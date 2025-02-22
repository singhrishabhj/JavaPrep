# Java Comparison Operators: Making Decisions in Code

## Introduction
Welcome! Today, we'll explore **Java comparison operators**, which help us make decisions in our programs by comparing values. These operators return `true` or `false`, allowing us to control the flow of code.

## Understanding Comparison Operators
Imagine piloting a spaceship. To choose a destination, you compare distances, just like we compare values in programming. Comparison operators return **true** or **false**, making them essential for decision-making in Java. 
Java provides six comparison operators:

- **Equal to (`==`)**
- **Not equal to (`!=`)**
- **Greater than (`>`)**
- **Less than (`<`)**
- **Greater than or equal to (`>=`)**
- **Less than or equal to (`<=`)**

## Real-World Example: Spaceship vs. Asteroid
```java
int spaceshipSpeed = 20000;  // speed in mph
int asteroidSpeed = 15000;   // speed in mph
System.out.println("Is the spaceship faster than an asteroid? " + (spaceshipSpeed > asteroidSpeed));
// Output: Is the spaceship faster than an asteroid? true
```
Here, we compare speeds using `>` and get `true` because the spaceship is indeed faster.

## Using `==` and `!=`
These operators check if two values are equal or not.

```java
int currentFuel = 90;
int requiredFuel = 100;

boolean isEnoughFuel = currentFuel == requiredFuel;  // false
boolean isFuelLow = currentFuel != requiredFuel;  // true
```
- `==` checks if values are equal.
- `!=` checks if values are different.

## Using `<`, `>`, `<=`, and `>=`
Comparing distances to two planets:

```java
int distanceA = 5000;
int distanceB = 3000;

boolean isACloser = distanceA < distanceB;  // false
boolean isBCloserOrSame = distanceA >= distanceB;  // true
```
- `isACloser` is `false` because `distanceA` is greater.
- `isBCloserOrSame` is `true` because `distanceB` is closer.

## Summary
- **Comparison operators** help us make decisions.
- They return `true` or `false` based on conditions.
- Common use cases include checking values, controlling program flow, and making logical decisions.

## Lesson Recap

### What You've Learned:
1. Java has six comparison operators (`==`, `!=`, `<`, `>`, `<=`, `>=`).  
2. These operators return `true` or `false`, helping control program flow.  
3. They are used to compare numbers, speeds, distances, and other values.  
4. Understanding comparisons is key to decision-making in Java programs.  

Keep practicing, and let's continue coding! 


