package leetcode.solutions;


/*
Given an integer x, return true if x is apalindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:

-231 <= x <= 231 - 1

https://leetcode.com/problems/palindrome-number/description/
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        var result = true;
        var stringX= String.valueOf(x);
        for (int i = 0; i < stringX.length(); i++) {
            if (stringX.charAt(i) != stringX.charAt(stringX.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
