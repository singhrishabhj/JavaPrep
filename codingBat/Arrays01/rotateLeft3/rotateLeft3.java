//rotateLeft3

public int[] rotateLeft3(int[] nums) {
  
  int x=nums[0];
  nums[0]=nums[1];
  nums[1]=nums[2];
  nums[2]=x;
  
  return nums;
}
 