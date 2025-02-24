# Java Loops

## Introduction
In space exploration, astronauts need to perform **repetitive tasks** such as checking spaceship controls, monitoring planetary signals, and tracking fuel levels. Instead of repeating code manually, we use **loops** to automate these tasks. Java provides three main types of loops:

- **for loop** - Useful when we know how many times we need to repeat a task.
- **while loop** - Runs as long as a condition remains true.
- **do-while loop** - Ensures at least one execution before checking the condition.

Let’s explore these loops using **space-related examples**! 🚀

---

## `for` Loop (Fixed Repetitions)
A `for` loop is great when we know how many times to repeat an action, like scanning a planet for alien signals **5 times**.

### Example:
```java
for (int scan = 1; scan <= 5; scan++) {
    System.out.println("Scanning planet: Attempt " + scan);
}
```

**Output:**
```
Scanning planet: Attempt 1
Scanning planet: Attempt 2
Scanning planet: Attempt 3
Scanning planet: Attempt 4
Scanning planet: Attempt 5
```

---

## `while` Loop (Condition-Based Repetitions)
Use a `while` loop when the number of repetitions **isn’t known beforehand**. For instance, we might keep refueling the spaceship **until it reaches 100% fuel**.

### Example:
```java
int fuelLevel = 50;
while (fuelLevel < 100) {
    System.out.println("Refueling... Current fuel level: " + fuelLevel + "%");
    fuelLevel += 10;
}
System.out.println("Fuel tank full! Ready for launch!");
```

**Output:**
```
Refueling... Current fuel level: 50%
Refueling... Current fuel level: 60%
Refueling... Current fuel level: 70%
Refueling... Current fuel level: 80%
Refueling... Current fuel level: 90%
Fuel tank full! Ready for launch!
```

---

## `do-while` Loop (Runs at Least Once)
The `do-while` loop is useful when **we must execute an action at least once** before checking the condition. Imagine an astronaut **checking for a signal** before deciding to scan again.

### Example:
```java
boolean signalDetected = false;
do {
    System.out.println("Checking for signals from alien life...");
    // Let's assume the signal is found on the second attempt
    signalDetected = true;
} while (!signalDetected);
System.out.println("Signal detected! Contacting aliens...");
```

**Output:**
```
Checking for signals from alien life...
Signal detected! Contacting aliens...
```

---

## Lesson Recap & Next Steps
### What You've Learned:
- **`for` loop** is useful for a fixed number of repetitions (e.g., scanning a planet 5 times).
- **`while` loop** runs until a condition is met (e.g., refueling until full).
- **`do-while` loop** runs at least once (e.g., checking for signals before deciding to stop).

### Next Steps:
In the next lesson, we’ll explore **Java String Concatenation**, which helps us combine text values, such as creating **mission logs**, **spacecraft messages**, or **astronaut status updates**. Keep coding and exploring! 🚀

