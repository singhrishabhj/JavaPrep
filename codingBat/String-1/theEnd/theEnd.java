// theEnd

public String theEnd(String str, boolean front) {
  if (front){
    return str.substring(0,1);
  }else 
  return str.substring(str.length()-1);
}

/**
 * Here's a concise explanation of the provided code:

1. **`if (front)`**:
   - Checks if the `front` boolean is `true`.

2. **`return str.substring(0, 1);`**:
   - If `front` is `true`, returns the first character of the string.

3. **`else return str.substring(str.length() - 1);`**:
   - If `front` is `false`, returns the last character of the string.

### Summary
- **When `front` is `true`**: The method returns the first character of the string.
- **When `front` is `false`**: The method returns the last character of the string.
 * 
 */