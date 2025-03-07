// Topic: Move Zeroes to the End of an Array

// Question:
// Given an array of integers, move all zeroes to the end of the array while maintaining the relative order of the non-zero elements.

// Problem Explanation:
// You are given an array that may contain zeroes. 
// The goal is to move all zeroes to the end of the array while keeping the order of non-zero elements unchanged. 
// This should be done in-place, without using additional arrays or data structures.

// Approach:
// 1. Iterate through the array, maintaining a pointer to the position where the next non-zero element should go.
// 2. When a non-zero element is encountered, swap it with the element at the pointer position.
// 3. After processing all elements, all zeroes will be moved to the end of the array while maintaining the order of non-zero elements.

// Solution:
