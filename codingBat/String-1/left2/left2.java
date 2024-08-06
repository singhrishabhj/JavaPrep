// left2

public String left2(String str) {
  
  String first =str.substring(0,2); //only accept index 0 and 1
  String second =str.substring(2); //starts from index 2
  
  return second+first;
  
}
