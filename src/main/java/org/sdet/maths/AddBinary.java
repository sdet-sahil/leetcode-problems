package org.sdet.maths;

public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;

        while(i>=0 || j >=0 || carry ==1 ){
            if(i>=0)
                carry += a.charAt(i--) - '0';
            if(j >=0)
                carry += b.charAt(j--) - '0';
            res.append(carry % 2);
            carry = carry/2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args){
        String a = "11", b = "1";
        // Should Output: "100"
        System.out.println(addBinary(a,b));

        String a1 = "1010", b1 = "1011";
        // Should Output: "10101"
        System.out.println(addBinary(a1,b1));
    }
}
/*
https://leetcode.com/problems/add-binary/description/
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
