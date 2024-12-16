package org.sdet.arrays;

import java.util.HashMap;
import java.util.HashSet;

/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */
public class FindUniqueOccurences {

    static boolean findUniqueOccurences(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }

    public static void main(String[] args){
        int[] example1 = {1,2,2,1,1,3};
        // should print true
        System.out.println(findUniqueOccurences(example1));

        int[] example2 = {1,2};
        // should print false
        System.out.println(findUniqueOccurences(example2));
    }
}
