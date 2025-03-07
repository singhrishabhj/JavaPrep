// Topic: Find the Missing Number in an Array (1 to N)

// Question:
// Given an array containing N distinct numbers taken from the range 1 to N+1, find the missing number in the array.
// You need to find the missing number without using any extra space.

// Problem Explanation:
// You are given an array of size N containing distinct integers from the range 1 to N+1. 
// The array contains all numbers except for one missing number. 
// Your goal is to find this missing number efficiently without extra space.

// Approach:
// 1. Calculate the expected sum of the first N+1 numbers using the formula: sum = (N+1) * (N+2) / 2.
// 2. Sum all the elements of the given array.
// 3. The missing number will be the difference between the expected sum and the sum of the array.

// Solution:
