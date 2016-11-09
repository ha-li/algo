package com.gecko.string.matcher;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 11/8/16.
 */
public class StringMatchTest {

    @Test
    public void test_match() {
        String t = "abc";
        String p = "bc";

        int index = StringMatch.match(t, p);
        System.out.println(index);

        Assert.assertTrue(index == 1);
    }

    @Test
    public void test_match_fail() {
        String t = "abc";
        String p = "cb";

        int index = StringMatch.match(t, p);

        System.out.println(index);
        Assert.assertTrue(index == -1);
    }

    @Test
    public void test_match_longer() {
        String t = "money";
        String p = "ne";
        int index = StringMatch.match(t, p);
        System.out.println(index);
        Assert.assertTrue(index == 2);
    }

}