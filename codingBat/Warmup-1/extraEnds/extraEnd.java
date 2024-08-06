// extra Ends

public String extraEnd(String str) {
  
  String lastTwoString = str.substring(str.length() - 2 );
  
  return lastTwoString+lastTwoString+lastTwoString;
}


//explanation
//If str = "Hello", then str.length() is 5.
//str.length() - 2 is 3.
//str.substring(3) returns the substring starting from index 3 to the end of the string, which is "lo".