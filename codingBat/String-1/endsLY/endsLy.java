//endsLy

public boolean endsLy(String str) {
  
if (str.length()>=2 && str.substring(str.length()-2).equals("ly"))
  return true;
  else
  return false;
  
}
