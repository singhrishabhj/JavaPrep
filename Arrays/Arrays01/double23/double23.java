//double23

public boolean double23(int[] nums) {
  
  if(nums.length<=1)  //if length is less than 1
    return false; 
  
  if(nums.length==2){ //for length is 2 , we are checking if 2 twice or 3 twice are there
    if(nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3 )
      return true;
  }
   
  if(nums.length==3){ //or length is 3 , we are checking if 2 twice or 3 twice are there
    if(nums[0] == 2 && nums[1] == 2 || nums[1]==2 && nums[2]==2 || nums[0]==2 && nums[2]==2 || nums[0]==3 && nums[1]==3 || nums[1]==3 && nums[2]==3 || nums[0]==3 && nums[2]==3)
      return true;
  }
   
  return false;      //if there is length > 3 or no 2 twice or 3 twice are there.
  
}
