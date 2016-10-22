package com.gecko.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/21/16.
 */
public class BinaryUtilsTest {
    @Test
    public void toBinaryStringFour() throws Exception {
        String four = BinaryUtils.toBinaryString(4);
        Assert.assertEquals("100", four);
    }

    @Test
    public void toBinaryStringSeven() throws Exception {
        String actual = BinaryUtils.toBinaryString(7);
        Assert.assertEquals("111", actual);
    }

    @Test
    public void toBinaryStringEight() throws Exception {
        String actual = BinaryUtils.toBinaryString(8);
        Assert.assertEquals("1000", actual);
    }

    @Test
    public void toBinaryStringLargeNumber() throws Exception {
        String actual = BinaryUtils.toBinaryString(5435);
        Assert.assertEquals("1010100111011", actual);
    }

    @Test
    public void test_shift_right_even () {
        int op = 4;
        op = op >>1;
        Assert.assertTrue(op == 2);
    }

    @Test
    public void test_shift_right_odd () {
        int op = 5;
        op = op >>1;
        Assert.assertTrue(op == 2);
    }

    @Test
    public void test_shift_right_odd2 () {
        int op = 7;
        op = op >> 1;
        Assert.assertTrue(op == 3);
    }

    @Test
    public void test_shift_left() {
        int op = 25;
        op = op << 1;
        Assert.assertTrue(op == 50);
    }

    @Test
    public void test_shift_left2() {
        int op = 25;
        op = op << 2;
        Assert.assertTrue(op == 100);
    }
}