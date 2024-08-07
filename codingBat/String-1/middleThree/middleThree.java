//middleThree

public String middleThree(String str) {
    // Calculate the middle index of the string
    int middle = str.length() / 2;
    
    // Extract the right part of the middle three characters
    String right = str.substring(middle, middle + 2);
    
    // Extract the left part of the middle three characters
    String left = str.substring(middle - 1, middle);
    
    // Concatenate and return the left and right parts
    return left + right;
}
