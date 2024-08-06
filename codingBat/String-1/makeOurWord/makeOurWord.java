//make out word

public String makeOutWord(String out, String word) {
   
   String Start = out.substring(0,2);
   String End = out.substring(2,4);
  
  return (Start+word+End);
}
