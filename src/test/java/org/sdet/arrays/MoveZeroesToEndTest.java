package org.sdet.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeroesToEndTest {

    @Test
    public void testHappyCase(){
        int[] input = {0,0,1,2,3, 0};
        int[] result = MoveZeroesToEnd.moveZeroesToEnd(input);
        int[] expected = {1,2,3,0,0,0};
        Assert.assertEquals(result, expected);
    }
}
