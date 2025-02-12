# Java Basics

## Introduction
Hello, future programmers! Are you ready to kickstart your journey with Java? Today, we'll dive into the basics of Java — syntax and comments — and you'll write your first simple Java program.

Java, a widely-used, platform-independent language, is our spaceship for this exciting journey. Various applications, from mobile to enterprise-level, are built using Java. Here's an interesting fact: the game Minecraft was developed in Java!

Like the rules of English grammar, Java follows its own set of rules, known as syntax. Let's explore together!

## Java Syntax Basics
In Java, we use statements to perform actions, and each statement ends with a semicolon (`;`). Java employs curly braces (`{ }`) to define a block of code.

Look at this simple Java syntax example:

```java
class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
}
```

In this example, we've declared a class `MyFirstProgram`, included the `main` method, which is where the program starts executing, and presented a statement that prints "Hello, Java World!". You might not understand every single line of this code right now, but that's fine! We will cover it step-by-step in this and the next lessons.

## Say Hello to Comments
In code, we leave notes for ourselves — these are known as comments. These comments (notes) do not affect code execution in any way and are used to clarify things or leave some helpful notes for future developers (or yourself) working on this code. In Java, we use `//` for single-line comments and `/* */` for multi-line comments.

See how we use comments below:

```java
class MyFirstProgram {
   // Single-line comment. A very important note for myself
    public static void main(String[] args) {
       /*  
         Multi-line comment
         It spans several lines.
         I can use multi-line comments
         for longer notes that don't fit in a single line.
        */
        System.out.println("Hello, Java World!"); // This line prints "Hello, Java World!"
    }
}
```

In this instance, the phrases following `//` and those between `/* */` won't be considered when running the program. We use `System.out.println` statement to print the provided text to the console.

## Build Your First Java Program
Now, it's time to get a closer look at the first Java program you'll learn to write! Here is a simple Java program we have already explored:

```java
class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
}
```

Now, let's understand each part of the program:

- `class MyFirstProgram { }`: Here, we declare our class `MyFirstProgram`.
  - This is essential because Java requires all the code to be wrapped into some class. You can just remember this requirement for now; we will explain classes in detail later in our Java courses.
- `public static void main(String[] args) { }`: This is the starting point of our program, known as the `main` method. When you run the Java program, this is the method that gets executed.
  - You can consider this as an entry point. While words like `public`, `static`, `void`, and `String[]` might not make sense to you at this point, you can just remember that the `main` method should always be named like that and defined exactly this way.
- `System.out.println("Hello, Space Explorer!");`: This statement prints "Hello, Space Explorer!" to the console.

## Lesson Summary and Practice
Congratulations! You've ventured into Java programming and learned about syntax, semicolons, and comments. Exciting practice exercises are coming up next to reinforce your newly gained knowledge and help you write your first Java code. Remember, mistakes are stepping stones to success.

Happy coding! 🚀


