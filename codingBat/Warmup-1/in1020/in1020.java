//in1020

public boolean in1020(int a, int b) {
  return ((a>=10 && a<=20)||(b>=10 && b<=20));
}

//or
public boolean in1020(int a, int b) {
    if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
        return true;
    } else {
        return false;
    }
}

/**
 * The method directly checks the conditions (a >= 10 && a <= 20) and (b >= 10 && b <= 20) using if statements.
 * If either condition is true, meaning either a or b is between 10 and 20 inclusive, the method returns true.
 * Otherwise, if neither condition is true, it returns false.
 */
