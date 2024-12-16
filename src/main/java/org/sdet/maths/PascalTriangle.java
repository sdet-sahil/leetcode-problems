package org.sdet.maths;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    static List<List<Integer>> printPascalTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i = 1; i< numRows; i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j = 1; j< i; j++){
               int tmp = prevRow.get(j-1)+ prevRow.get(j);
               currRow.add(tmp);
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }

    public static void main(String[] args){
        // prints [[1]]
        System.out.println(printPascalTriangle(1));
        // prints [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        System.out.println(printPascalTriangle(5));
    }
}
/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */
