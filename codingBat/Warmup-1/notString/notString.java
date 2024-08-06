//notSring

public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
   //str.length() - tell about the string length
   //so the condition is if the string is >=3 and the subtring from index zero to 3 equal to 'not' which means if the staring of the string start with not retun on the string 
    return str;
  }
  
  return "not " + str;
  //else if there is no not added to the string add the 'not to that string and return it '
}