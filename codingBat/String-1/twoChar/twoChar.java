// twoChar

public String twoChar(String str, int index) {
    // Check if the index is too small or too large
    if (index < 0 || index + 2 > str.length()) {
        return str.substring(0, 2);
    } else {
        return str.substring(index, index + 2);
    }
}
