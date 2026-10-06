package org.sdet.HashMap;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 https://leetcode.com/problems/valid-anagram/description/

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false */

public class ValidAnagram {

    public static boolean isValidAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for(int i = 0; i< s1.length(); i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int i : freq){
            if(i !=0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isValidAnagram("abc", "cba"));
        System.out.println(isValidAnagram("a", "a" ));
        System.out.println(isValidAnagram("a", "ab" ));
        



    }
    
}
