package com.roopsai.implementations;

import org.junit.Test;
import org.junit.Assert;

public class CalculatingFunctionTest {

    @Test
    public void testCaseOne() {
       Assert.assertEquals(CalculatingFunction.calculateFunction(4), 2);
    }

    @Test
    public void testCaseTwo() {
        Assert.assertEquals(CalculatingFunction.calculateFunction(5), -3);
    }
}
