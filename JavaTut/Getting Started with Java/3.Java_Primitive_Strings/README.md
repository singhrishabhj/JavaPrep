# Introducing Numerical Data Types

In Java, we use **numerical data types** to represent numbers. In this lesson, we'll focus on `int` and `float`:
- `int` represents whole numbers.
- `float` represents decimal numbers (floating-point numbers).

### Integer (`int`)
The largest value an `int` can store is **2,147,483,647** (`2^31 - 1`), and the smallest is **-2,147,483,648** (`-2^31`). Example:

```java
int daysInWeek = 7;
System.out.println(daysInWeek); // Output: 7

int maximalInteger = 2147483647;
System.out.println(maximalInteger); // Output: 2147483647

// int tooBigInteger = 2147483648; //  Error! Value too large for int
```

### Floating-Point (`float`)
A `float` stores numbers with a **decimal point** and can hold up to **7 decimal digits of precision**:

```java
float pi = 3.1415926f;
System.out.println(pi); // Output: 3.1415926
```

**Note:** The `f` at the end differentiates a `float` from a `double`, which has higher precision.

---

# Discovering Boolean and Char Data Types

### Boolean (`boolean`)
A `boolean` can hold **only two values**: `true` or `false`, making it useful for logic-based operations.

```java
boolean isEarthRound = true;
System.out.println(isEarthRound); // Output: true

boolean isEarthFlat = false;
System.out.println(isEarthFlat); // Output: false
```

### Character (`char`)
A `char` stores a **single character** and supports **Unicode**, allowing a wide range of symbols:

```java
char firstLetterOfAlphabet = 'A';
System.out.println(firstLetterOfAlphabet); // Output: A
```

---

# Exploring the String Data Type

`String` is one of the most commonly used types in Java, representing **text sequences**:

```java
String welcome = "Welcome to Java!";
System.out.println(welcome); // Output: Welcome to Java!
```

### String Immutability
Once a `String` is created, its **value cannot be changed**.

---

# Understanding `null`

`null` represents **no value, nothing, or unknown**. It is **not the same** as an empty string (`""`) or `0`.

```java
String unknown = null;
System.out.println(unknown); // Output: null
```

⚠ **Warning:** Operations on `null` cause a **NullPointerException**. We will explore this further in upcoming lessons.

---

# Lesson Recap & Next Steps

🎉 You've learned:
1. `int` and `float` for numbers.
2. `boolean` for logical values.
3. `char` for single characters.
4. `String` for text.
5. `null` for unknown values.

Next, we'll **dive deeper into data types and memory usage**. Keep practicing and mastering Java! 🚀

