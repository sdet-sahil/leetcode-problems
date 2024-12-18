package org.sdet.strings;

public class LengthOfLastWord {

   private static int findLengthOfLastWord(String str){
       String trimmed = str.trim();

       for(int i = trimmed.length()-1; i>=0; i--){
           if(!Character.isLetterOrDigit(trimmed.charAt(i))){
               return trimmed.length()-i-1;
           }
       }

       return trimmed.length();
    }

    public static void main(String[] args){
       // prints 5
        System.out.println(findLengthOfLastWord("Hello World"));
        String s = "   fly me   to   the moon  ";
        // prints 4, length of moon
        System.out.println(findLengthOfLastWord(s));
        //prints 5
        System.out.println(findLengthOfLastWord("hello"));
    }
}
