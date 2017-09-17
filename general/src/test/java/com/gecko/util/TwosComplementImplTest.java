package com.gecko.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hlieu on 11/1/16.
 */
public class TwosComplementImplTest {

    @Test
    public void test_one() {
        int val = TwosComplementImpl.twosComplement("1110", 4);
        // the leading value means it is negative
        // radix of 4 bit representation of numbers, so range is
        // between (2^3) - 1 and -(2^3)

        // 0000 == 0
        // 0001 == 1
        // 0010 == 2
        // 0011 == 3
        // 0100 == 4
        // 0101 == 5
        // 0110 == 6
        // 0111 == 7
        // 1000 == -(16-8) = -8
        // 1001 == -(16-9) = -7
        // 1010 == -(16-10) = -6
        // 1011 == -(16-11) = -5
        // 1100 == -(16-12) = -4
        // 1101 == -(16-13) = -3
        // 1110 == -(16-14) = -2
        // 1111 == -(16-16) = -1
        Assert.assertTrue(val == -2);
    }

}