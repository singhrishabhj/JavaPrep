// posNeg

public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}

//or by using ternary operator

public boolean posNeg(int a, int b, boolean negative) {
  return (negative) ? (a < 0 && b < 0) : ((a < 0 && b > 0) || (a > 0 && b < 0));
}
