package org.sdet.strings;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] strings){
        String result = strings[0];

        for(int i = 1; i< strings.length; i++){
            while(strings[i].indexOf(result) !=0){
                result = result.substring(0, result.length()-1);
            }
            if(result.isEmpty()) return "";
        }

        return result;
    }
}
