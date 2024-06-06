//reverse3

public int[] reverse3(int[] nums) {
  int x=nums[0];
  nums[0]=nums[2];
  nums[2]=x;
  
  return nums;
}
