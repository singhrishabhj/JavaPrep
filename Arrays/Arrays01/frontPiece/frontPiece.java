//frontPiece

public int[] frontPiece(int[] nums) {
  
  if(nums.length==1){                //Here if array length is 1 so element we return is Nums[0]
    return new int []{nums[0]};      // We are returning the new array with the 0th index element
  }else if(nums.length==0){          //Here if array length is 0 so element we return is Nums[Empty]
    return new int[]{};              //Returning new array
  }else
  return new int[] {nums[0],nums[1]};//Return the nums[0] and nums[1] , irrespective of array size
}
