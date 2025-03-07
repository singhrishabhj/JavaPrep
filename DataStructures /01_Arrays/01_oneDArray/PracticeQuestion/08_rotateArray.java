// Topic: Rotate the Array by K Positions

// Question:
// Given an array and a number K, rotate the array by K positions to the right. 
// After rotation, elements that were at the end of the array should move to the beginning, while maintaining the order of elements.


// Problem Explanation:
// You are given an array and a number K. 
// The goal is to rotate the array to the right by K positions, 
// where K can be any non-negative integer, and the order of the elements should be preserved in the rotated array.

// Approach:
// 1. First, calculate the effective number of rotations, which is K % n (n is the length of the array).
// 2. To rotate the array by K positions to the right:
//    - Reverse the entire array.
//    - Reverse the first K elements (from index 0 to K-1).
//    - Reverse the remaining elements (from index K to n-1).
