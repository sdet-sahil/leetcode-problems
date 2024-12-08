package org.sdet.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestCommonPrefixTest {

    @Test(description = "Test when there is no common prefix")
    public void testNoCommonPrefix(){
        String[] testData = {"GoodMorning", "Hiie", "Hiee"};
        String expectedResult = "";
        String actualResult = LongestCommonPrefix.findLongestCommonPrefix(testData);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Test happy Scenario")
    public void testHappyFlow(){
        String[] testData = {"Hi", "Hiie", "Hiee"};
        String expectedResult = "Hi";
        String actualResult = LongestCommonPrefix.findLongestCommonPrefix(testData);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
