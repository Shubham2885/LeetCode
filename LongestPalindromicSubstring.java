/*
 * 
 * Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

public class LongestPalindromicSubstring {
    public static void main(String[] args){

    }
    public String longestPalindrome(String str) {
        if(str.length() == 1) {
            return str;
        } else if(isPal(str)){
            return str;
        } else {
            String s = "";
            for(int i=0;i<str.length();i++){
                int m = str.length();
                while(m > 1) {
                    if(isPal(str.substring(i,m))){
                        if(s.length() < str.substring(i,m).length()) {
                            s = str.substring(i,m);
                        }
                        break;
                    }else {
                        m--;
                    }
                }
            }
            return s;
        }
    }

    public static boolean isPal(String str) {
        boolean flag = true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                flag = true;
            }else {
                return false;
            }
        }
        return flag;
    }
}
