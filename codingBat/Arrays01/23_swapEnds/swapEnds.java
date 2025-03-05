//swapEnds

public int[] swapEnds(int[] nums) {
  int x=nums[0];
  nums[0]=nums[nums.length-1];
  nums[nums.length-1]=x;
  
  return nums;
}
