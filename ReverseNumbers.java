/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */

public class ReverseNumbers {
    public int reverse(int x) {
        if(x > 0) {
            return doReverse(x);
        } else {
            x = x * -1;
            int r = doReverse(x);
            return r * -1;
        }
    }

    public static int doReverse(int x) {
        double sum = 0;
        while(x!=0){
            int rev = x%10;
            sum = (sum * 10) + rev;
            x = x/10;
        }
        if(sum >= 2147483647 || sum <= -2147483648) {
            return 0;
        }
        return (int) sum;
    }
}
