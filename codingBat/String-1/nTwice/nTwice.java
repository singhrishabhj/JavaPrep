//nTwice

public String nTwice(String str, int n) {
  
   String firstN = str.substring(0,n);
   String lastN = str.substring(str.length()-n);
  
   return (firstN+lastN);
  
}
