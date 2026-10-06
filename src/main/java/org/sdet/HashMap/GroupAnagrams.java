package org.sdet.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
https://leetcode.com/problems/group-anagrams/description/
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

*/
public class GroupAnagrams {

     public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupMap = new HashMap<>();

        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(groupMap.containsKey(sorted)) {
                List<String> li = groupMap.get(sorted);
                li.add(str);
                groupMap.put(sorted, li);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groupMap.put(sorted, newGroup);
            }
         } 
        
        return new ArrayList<>(groupMap.values());
     }

     public static void main(String[] args){
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        String[] input2 = {"a"};
        GroupAnagrams cls = new GroupAnagrams();
        List<List<String>> result = cls.groupAnagrams(input);
        List<List<String>> result2 = cls.groupAnagrams(input2);
        System.out.println(result);
        System.out.println(result2);



     }
    
}
