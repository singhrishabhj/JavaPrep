//start1 

public int start1(int[] a, int[] b) {
  
  int check=0; /
  
  if (a.length>0 && a[0]==1 ){
    check+=1;
  }
  
  if (b.length>0 && b[0]==1){
    check+=1;
  }
  
  return check;
}
