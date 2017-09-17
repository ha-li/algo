package com.gecko.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hlieu on 11/1/16.
 */
public class ReverseIntTest {

    @Test
    public void test_hundreds() {

        int reverse = ReverseInt.reverse(314);
        Assert.assertTrue(reverse == 413);
    }

    @Test
    public void test_ones() {

        int reverse = ReverseInt.reverse(4);
        Assert.assertTrue(reverse == 4);
    }

    @Test
    public void test_negative_ones() {

        int reverse = ReverseInt.reverse(-4);
        Assert.assertTrue(reverse == -4);
    }

    @Test
    public void test_negative_hundreds() {

        int reverse = ReverseInt.reverse(-400);
        Assert.assertTrue(reverse == -4);
    }

    @Test(expected=StackOverflowError.class)
    public void test_too_big () {
        //int is 32 bit, max value is 2^32 - 1 (2,147,483,647)
        // the reverse of it is too big for an int,
        // so the reverse will not be a true reverse
        int max = Integer.MAX_VALUE;

        int overflowed = ReverseInt.reverse(max);

        //System.out.println(overflowed);
    }
}