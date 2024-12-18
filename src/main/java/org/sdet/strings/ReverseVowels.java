package org.sdet.strings;

public class ReverseVowels {

    static boolean isVowel(char ch){
        return  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    private static String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start < end){
            if(isVowel(arr[start]) && isVowel(arr[end])){
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            } else if(!isVowel(arr[start]) && !isVowel(arr[end])){
                start++;
                end--;
            } else if(!isVowel(arr[start]) && isVowel(arr[end])){
                start++;
            } else end--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args){
        String i1 = "IceCreAm";
        // should print "AceCreIm"
        System.out.println(reverseVowels(i1));
    }
}

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"



Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
