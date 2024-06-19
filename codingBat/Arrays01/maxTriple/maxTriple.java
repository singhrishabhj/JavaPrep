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


//using ternary operator
public int maxTriple(int[] nums) {
  
 int x =nums[0];
  int y = nums[nums.length/2];
  int z =nums[nums.length-1];
   
  
int ans = x>y?x>z?x:z:y>z?y:z; //x=x>z?x:z ,y= y>z?y:z
return ans;
}
