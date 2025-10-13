// Input: s = " -12345"
// Output: -12345
// Explanation:
// Ignore leading whitespaces.
// The sign '-' is encountered, indicating the number is negative.
// Digits 12345 are read and converted to -12345.

public class Main {

    static final int INT_MAX = 2147483647;
    static final int INT_MIN = -2147483648;

    public static int myAtoi(String s) {
        // Step 1: trim leading spaces
        s = s.trim();
        if (s.length() == 0) return 0;

        // Step 2: determine sign
        int sign = 1;
        int index = 0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: recursively convert digits
        return convertRecursively(s, index, 0, sign);
    }

    private static int convertRecursively(String s, int index, long result, int sign) {
        // Base case: stop if index is out of bounds or non-digit found
        if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return (int) (sign * result);
        }

        // Add current digit to result
        int digit = s.charAt(index) - '0';
        result = result * 10 + digit;

        // Check overflow conditions before recursion
        long temp = sign * result;
        if (temp > INT_MAX) return INT_MAX;
        if (temp < INT_MIN) return INT_MIN;

        // Recursive call for next character
        return convertRecursively(s, index + 1, result, sign);
    }

    // Test the function
    public static void main(String[] args) {
        System.out.println(myAtoi("   -12345"));     // Output: -12345
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("   +42"));        // Output: 42
        System.out.println(myAtoi("91283472332"));   // Output: 2147483647 (clamped)
        System.out.println(myAtoi("-91283472332"));  // Output: -2147483648 (clamped)
    }
}