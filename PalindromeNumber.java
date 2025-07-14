/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.

 

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
 */

public class PalindromeNumber {
   public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } else if(x < 10) {
            return true;
        } else {
            return x == reverse(x);
        }
    }

    public static int reverse(int x) {
        if(x > 0) {
            return (int) doReverse(x);
        } else {
            x = x * -1;
            int r = (int) doReverse(x);
            return r * -1;
        }
    }

    public static double doReverse(int x) {
        double sum = 0;
        while(x!=0){
            double rev = x % 10;
            sum = (sum * 10) + rev;
            x = x/10;
        }
        if(sum >= 2147483647 || sum <= -2147483648) {
            return 0;
        }
        return sum;
    } 
}
