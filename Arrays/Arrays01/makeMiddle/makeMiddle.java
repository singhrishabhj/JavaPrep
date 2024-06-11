//makeMiddle
public int[] makeMiddle(int[] nums) {
  
    int[] x =new int[2];        //lengthOfArray =4 ={9,8,3,5}
    x[0]=nums[nums.length/2-1]; //a[0]=nums[4\2 -1]=nums[2-1]=arr[1]= 8
    x[1]=nums[nums.length/2];   //arr[2]= nums[4\2]=arr[2]= 3
  
    return x;
}


//single line of code

public int[] makeMiddle(int[] nums) {
  
 return new int[] {nums[nums.length/2-1],nums[nums.length/2]}; 
  
}
