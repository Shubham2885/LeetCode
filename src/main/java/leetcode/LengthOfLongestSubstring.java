package leetcode;

/*
 * 
 * 3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.
 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LengthOfLongestSubstring {
    
    public static void main(String args[]){
        System.out.println("Hellow");
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }else {
            StringBuilder sub = new StringBuilder();
        int max = 0;
        for(int m=0;m<s.length();m++){

        for(int i=m;i<s.length();i++){
            String x = sub.toString();
            if(!x.contains(String.valueOf(s.charAt(i)))){
                sub.append(String.valueOf(s.charAt(i)));
                if(max < sub.length()){
                        max = sub.length();
                    }
            }else {
                if(max < sub.length()){
                    max = sub.length();
                }
                sub = new StringBuilder();
                break;
            }
        }}
        return max;
        }
    }
}
