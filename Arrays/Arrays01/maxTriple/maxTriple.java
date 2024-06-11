//maxTriple

public int maxTriple(int[] nums) {
  
  int x =nums[0];
  int y = nums[nums.length/2];
  int z =nums[nums.length-1];
  
  if(x>y && x>z){
    return x;
  }else if (y>x && y>z){
    return y;
  }else
  return z;
  
}
