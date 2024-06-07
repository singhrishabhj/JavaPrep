//middleWay

public int[] middleWay(int[] a, int[] b) {
  
  int[] x= new int[2];
  x[0]=a[1];
  x[1]=b[1];
  return x;
}


/**
 * single line code for this problem
 */

public int[] middleWay(int[] a, int[] b) {
  
  return new int[] {a[1],b[1]};
}
