// Topic: Second Largest Element in an Array

// Question:
// Given an array of integers, find the second largest element in the array. 
// If there is no second largest element, return -1.


// Problem Explanation:
// You are given an array of integers. The goal is to find the second largest element in the array.
// A second largest element is the element that is smaller than the largest element but greater than the rest of the elements in the array.
// If there is no second largest element (e.g., if the array contains only one unique element), return -1.

// Approach:
// 1. Initialize two variables, `first` and `second`, to store the largest and second largest elements, respectively.
// 2. Traverse the array:
    // - For each element:
    // - If the element is greater than the `first` element, update `second` to be `first`, and then update `first` to the current element.
    // - Otherwise, if the element is greater than `second` and not equal to `first`, update `second`.
// 3. After traversing the array, check if `second` has been updated (i.e., it is different from its initial value).
// 4. If `second` is still its initial value (indicating there is no second largest element), return -1. Otherwise, return `second`.

//Solution:

