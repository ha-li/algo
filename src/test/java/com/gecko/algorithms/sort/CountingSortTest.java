package com.gecko.algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/23/16.
 */
public class CountingSortTest {

    @Test
    public void test_max() throws Exception {
        Method max = CountingSort.class.getDeclaredMethod("max", Integer[].class);
        max.setAccessible(Boolean.TRUE);

        Integer[] input = {3, 5, 9, 11, 5, 12, 4};
        Object[] params = new Object[] {input};

        int max_val = (Integer) max.invoke(null, params);
        Assert.assertTrue(max_val == 12);
    }

    @Test
    public void test_cardinal_count() throws Exception {
        Method cardinal_count = CountingSort.class.getDeclaredMethod("_cardinal_count", int[].class, Integer[].class);
        cardinal_count.setAccessible(Boolean.TRUE);

        Integer[] input = {3, 5, 6, 1, 5, 1, 4};
        int[] aux_k = {0,0,0,0,0,0,0};
        Object[] params = new Object[] {aux_k, input};

        cardinal_count.invoke(null, params);
        int[] expected = {0, 2, 2, 3, 4, 6, 7};
        Assert.assertArrayEquals(expected, aux_k);
    }

    @Test
    public void test_sort() throws Exception {

        Integer[] input = {3, 5, 6, 1, 5, 1, 4};

        Integer[] expected = {1, 1, 3, 4, 5, 5, 6};

        Integer[] ret = CountingSort.sort(input);
        Assert.assertArrayEquals(expected, ret);
    }

    @Test
    public void test_sort2() throws Exception {

        Integer[] input = {33, 5, 16, 12, 15, 1, 4};
        Integer[] expected = {1, 4, 5, 12, 15, 16, 33};

        Integer[] ret = CountingSort.sort(input);
        Assert.assertArrayEquals(expected, ret);
    }

    @Test
    public void test_sort3() throws Exception {

        Integer[] input = {3, 5, 1, 2, 5, 1, 4, 8, 19, 10, 12, 11};
        Integer[] expected = {1, 1, 2, 3, 4, 5, 5, 8, 10, 11, 12, 19 };

        Integer[] ret = CountingSort.sort(input);
        Assert.assertArrayEquals(expected, ret);
    }

    // @Test
    public void test_correct_for_negatives() throws Exception {
        Method correct = CountingSort.class.getDeclaredMethod("correct_for_negatives", Integer[].class, Integer.class, Boolean.class);
        correct.setAccessible(Boolean.TRUE);
        Integer[] input = {3, -5, 1};
        Integer fudge = 0;
        Boolean hasNegatives = Boolean.FALSE;
        Object[] params = new Object[] {input, fudge, hasNegatives};

        correct.invoke(null, params);
        Assert.assertEquals(new Long(5), new Long(fudge));
    }

    @Test
    public void negative_sort() throws Exception {
        Integer[] input = {3, -5, 1};
        Integer[] expected = {-5, 1, 3};
        Integer[] ret = CountingSort.sort(input);
        Assert.assertArrayEquals(expected, ret);
    }

    @Test
    public void negative_sort2() throws Exception {
        Integer[] input = {-6, -5, 1};
        Integer[] expected = {-6, -5, 1};
        Integer[] ret = CountingSort.sort(input);
        Assert.assertArrayEquals(expected, ret);
    }

    @Test
    public void negative_sort3() throws Exception {
        Integer[] input = {-6, 1, 4, -2, -10, 20, 2, 1, 0, 10};
        Integer[] expected = {-10, -6, -2, 0, 1, 1, 2, 4, 10, 20};
        Integer[] ret = CountingSort.sort(input);
        Assert.assertArrayEquals(expected, ret);
    }
}