package org.sdet.strings;

import java.util.Arrays;
import java.util.List;

public class ValidWordSquare {
    static String getVerticalWord(List<String> words, int col){
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (col < word.length()) {
                sb.append(word.charAt(col));
            }
        }
        return sb.toString();
    }
        public static boolean validWordSquare(List<String> words) {
            if(words.isEmpty()) return false;
            for(int i = 0; i< words.size(); i++){
                String word = words.get(i);
                String verticalWord = getVerticalWord(words, i);
                if(!word.equals(verticalWord)){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args){
            String[] word1 = {"ball","area","read","lady"};
            System.out.println(validWordSquare(Arrays.asList(word1))); // prints false
            String[] word2 =  {"abcd","bnrt","crm","dt"};
            System.out.println(validWordSquare(Arrays.asList(word2))); // prints true
            String[] word3 =  {"abcd","bnrt","crmy","dtye"};
            System.out.println(validWordSquare(Arrays.asList(word3))); // prints true
        }
    }

    /*
    Input: words = ["abcd","bnrt","crm","dt"]
Output: true
Explanation:
The 1st row and 1st column both read "abcd".
The 2nd row and 2nd column both read "bnrt".
The 3rd row and 3rd column both read "crm".
The 4th row and 4th column both read "dt".
Therefore, it is a valid word square.
https://leetcode.com/problems/valid-word-square/description/
     */

