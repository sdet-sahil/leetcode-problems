package org.sdet.arrays;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
    static int[] findTwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length; i++ ){
            map.put(arr[i],i);
        }

        for(int i = 0; i< arr.length; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff) && i != map.get(diff) ){
                return new int[] {i, map.get(diff)};
            }
        }
        return new int[] {};
    }
}
