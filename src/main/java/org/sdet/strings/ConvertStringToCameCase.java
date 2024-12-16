package org.sdet.strings;
/*
Problem Statement
Given a sentence having lowercase characters, the task is to convert it to Camel Case. In Camel Case, words are joined without spaces, the first word keeps its original case, and each subsequent word starts with an uppercase letter.

Examples:
Input: “i got intern at-geeksforgeeks”
Output: “iGotInternAtGeeksforgeeks”

Input: “here comes the garden”
Output: “hereComesTheGarden”
 */

public class ConvertStringToCameCase {

    public static String convertToCamelCase(String input){
        StringBuilder result = new StringBuilder();
        String trimmed = input.trim();
        String[] words = trimmed.split("[^A-Za-z1-9]");
        for(int i = 0; i < words.length; i++ ){
            words[i] = words[i].toLowerCase();
            if(i > 0){
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
            result.append(words[i]);
        }
        return result.toString();
    }
}
