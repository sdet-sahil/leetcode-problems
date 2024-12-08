package org.sdet.arrays;

public class MoveZeroesToEnd {

    public static int[] moveZeroesToEnd(int[] arr){
        int bucketSize = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                bucketSize += 1;
            else {
                int tmp = arr[i];
                arr[i] = 0;
                arr[i-bucketSize] = tmp;
            }
        }
        return arr;
    }
}
