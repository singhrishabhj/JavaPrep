// maxEnds3

public int[] maxEnd3(int[] nums) {
  int max;
  if(nums[0]>nums[1] && nums[0]>nums[1]){
    max=nums[0];
  } else if (nums[1]>nums[2] && nums[1]>nums[0]){
    max=nums[1];
  }else 
   max=nums[2]; 
   
   nums[0]=max; //assigning the max value to arrays
   nums[1]=max;
   nums[2]=max;
   
   return nums;
}