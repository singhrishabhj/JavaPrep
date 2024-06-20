//parrotTrouble

public boolean parrotTrouble(boolean talking, int hour) {
  if(talking && (hour<7 || hour>20) )
  return true;
  else 
  return false;
}

//or 

public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour < 7 || hour > 20));
}

// It checks if the parrot is talking (talking is true).
// It checks if the hour is less than 7 or greater than 20.
// If both conditions are true, it returns true; otherwise, it returns false.