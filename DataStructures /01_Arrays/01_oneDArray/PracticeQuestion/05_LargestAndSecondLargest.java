// Topic: Find the Largest and Second Largest Elements in an Array

// Question:
// Given an array of integers, find the largest and the second largest elements in the array.
// Write a method to return both the largest and second largest elements.

// Problem Explanation:
// You are given an array of integers. The goal is to identify the two largest elements in the array.
// To do this, you can iterate through the array while maintaining two variables to track the largest and second largest elements.

// Approach:
// 1. Initialize two variables, `largest` and `secondLargest`, with a value smaller than any element in the array.
// 2. Traverse the array. For each element:
//    - If the element is larger than `largest`, update `secondLargest` to be `largest` and then update `largest`.
//    - Otherwise, if the element is larger than `secondLargest`, update `secondLargest`.
// 3. After traversing the array, return both `largest` and `secondLargest`.

