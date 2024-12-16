package org.sdet.maths;

public class PalindromeNumber {

    static boolean isPalindrome(int num){
      if(num < 0) return false;
      int reversed = 0;
     int tmp = num;
     while(tmp !=0){
         int digit = tmp%10;
         reversed = reversed * 10 + digit;
         tmp = tmp/10;
     }
     return reversed == num;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121)); // prints true
        System.out.println(isPalindrome(120)); // prints false
        System.out.println(isPalindrome(-11)); // prints false
    }
}
