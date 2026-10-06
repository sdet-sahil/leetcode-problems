package org.sdet.heaps;

import java.util.Arrays;
import java.util.PriorityQueue;
/*
https://leetcode.com/problems/k-closest-points-to-origin/description/
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 */
public class kClosestPointsToOrigin {

   public static int[][] kClosest(int[][] points, int k) {
       
       PriorityQueue<int[]> q = new PriorityQueue<>((p1, p2)-> {
           int d1 = p1[0] * p1[0] + p1[1] * p1[1] ;
           int d2 = p2[0] * p2[0] + p2[1] * p2[1];
           return Integer.compare(d2,d1);
       });
       
       
       for(int i=0; i< points.length; i++){
           q.add(points[i]);
           if(q.size()>k) q.poll();
       }
       
       int[][] r = new int[k][2];
       int j =0;
       for(int[] p : q){
        r[j++] = p;
       }
       return r;

   }

   public static void main(String[] args){
    int[][] inputArr =  {{3,3},{5,-1},{-2,4}};
    int k = 2;
    int[][] res = kClosest(inputArr, k);
    System.out.println(Arrays.deepToString(res));
   }
    
}
