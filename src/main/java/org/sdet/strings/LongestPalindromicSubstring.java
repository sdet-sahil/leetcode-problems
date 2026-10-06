package org.sdet.strings;
/*
https://leetcode.com/problems/longest-palindromic-substring/description/
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

public class LongestPalindromicSubstring {

    public static String expand(String s, int l, int r){
        while(l>=0 && r <s.length() && (s.charAt(l) == s.charAt(r))){
            l--;
            r++;
        }
        return s.substring(l+1,r);

    }

    public static String longestPalindromic(String input){
        String longest = "";
        for(int i = 0; i< input.length(); i++){
           String even =  expand(input, i, i);
           String odd = expand(input, i, i+1);
           String current = even.length() > odd.length() ? even : odd;
           if(current.length() > longest.length()) 
            longest = current;

        }
        return longest;
    } 

    public static void main(String[] args){
        System.out.println(longestPalindromic("dcb"));
    }
    
}
