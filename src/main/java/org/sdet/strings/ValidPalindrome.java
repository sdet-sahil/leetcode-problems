package org.sdet.strings;

public class ValidPalindrome {

    private static boolean isValidPalindrome(String s){
        if(s.isEmpty()) return true;

        String cleanedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int start = 0;
        int end = cleanedString.length()-1;
        while(start < end){
            if(cleanedString.charAt(start) == cleanedString.charAt(end)){
                start++;
                end--;
            } else return false;
        }
        return true;

    }

    public static void main(String[] args){
        String s1 = "race a car";
        // should print false
        System.out.println(isValidPalindrome(s1));
        String s2 = "A man, a plan, a canal: Panama";
        // "amanaplanacanalpanama" is a palindrome
        System.out.println(isValidPalindrome(s2));

    }
}
