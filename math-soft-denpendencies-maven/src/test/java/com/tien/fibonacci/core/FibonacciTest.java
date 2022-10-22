
package com.tien.fibonacci.core;

import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class FibonacciTest {
    @Test(alwaysRun = true, dependsOnMethods = {"isFibonacciTest"})
    public void chekcIndexTest() {
        int expected = 6;
        assertEquals(CheckFibonacci.checkIndex(8), expected);
    }

    @Test
    public void isFibonacciTest() {
        String expected = "yes";
        String actual = CheckFibonacci.isFibonacci(8)? "yes":"no";
        assertEquals(actual, expected);
        //assertTrue(false);
    }
}
