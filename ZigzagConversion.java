/*
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 */


public class ZigzagConversion {
    public String convert(String str, int n) {
        StringBuilder sb = new StringBuilder();

        if(n == 1 || str.length() <= n) {
            return str;
        } else {
            int m = 0;
            for(int i=0;i<n;i++){
                int k = (n-1-i)*2;
                if(k==0){
                    k = (n-1)*2;
                    m = 0;
                }
                append(i, k, m, str, sb);
                m = (i+1) * 2;
            }
        }

        return sb.toString();
    }

    public static void append(int i, int k, int m, String str, StringBuilder sb) {
        sb.append(str.charAt(i));
        if(m!=0){
            while(i<str.length()) {
                i = i + k;
                if(i<str.length()){
                    sb.append(str.charAt(i));
                    i = i + m;
                    if(i<str.length()){
                        sb.append(str.charAt(i));
                    }
                }
            }
        }else {
            while(i<str.length()) {
                i = i + k;
                if(i<str.length()){
                    sb.append(str.charAt(i));
                }
            }
        }
    }
}
