package com.gecko.string.matcher;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hlieu on 11/8/16.
 */
public class StringMatchTest {

    StringMatch bruteForce = new StringMatchBruteForce();
    StringMatch hashMap = new StringMatchMap();

    @Test
    public void test_match() {
        String t = "abc";
        String p = "bc";

        int index = bruteForce.match(t, p);
        System.out.println(index);

        Assert.assertTrue(index == 1);
    }

    @Test
    public void test_match_fail() {
        String t = "abc";
        String p = "cb";

        int index = bruteForce.match(t, p);

        System.out.println(index);
        Assert.assertTrue(index == -1);
    }

    @Test
    public void test_match_longer() {
        String t = "money";
        String p = "ne";
        int index = bruteForce.match(t, p);
        System.out.println(index);
        Assert.assertTrue(index == 2);
    }

    @Test
    public void test_hash_match() {
        String t = "honeypot";
        String p = "ypo";
        int index = hashMap.match(t, p);
        System.out.println(index);
        Assert.assertTrue(index == 4);
    }

    @Test
    public void test_hash_match_fail() {
        String t = "honeypot";
        String p = "poy";
        int index = hashMap.match(t, p);
        System.out.println(index);
        Assert.assertTrue(index == -1);
    }

}