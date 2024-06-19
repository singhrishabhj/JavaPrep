//diff21

//"The absolute value of a real number ( x ), denoted as ( | x | ), is the non-negative value of ( x ), irrespective of its sign."
//The absolute value also known as Modulus. |x|

public int diff21(int n) {
  if(n<=21)
  return 21-n; 
  else
  return (n-21)*2; //if number is over 21 , we have to return the double of the difference
}


//or

/**
 * Math.abs => Math.absolute
 * Definition => The (modulus) absolute value of x. If x is negative (including -0), 
 *               returns -x. Otherwise, returns x. The result is therefore 
 *               always a positive number or 0.
 */
public int diff21(int n) {
    int difference = Math.abs(n - 21); // Calculate the absolute difference between n and 21
    
    if (n <= 21) {
        return difference;
    } else {
        return difference * 2;
    }
}