//makeLast

public int[] makeLast(int[] nums) {
  int[] newArr = new int[2*nums.length]; //double the length of original array

  newArr[newArr.length-1]=nums[nums.length-1];// last element same as the original array

  //by default, a new int array contains all 0's, by default the value for int is zero.
  return newArr;
}
