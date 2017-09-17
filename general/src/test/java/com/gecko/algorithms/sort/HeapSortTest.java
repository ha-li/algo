package com.gecko.algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by hlieu on 10/21/16.
 */
public class HeapSortTest extends HeapSort {
    @Test
    public void sort() throws Exception {

    }


    @Test
    public void test_parent_old() throws Exception {
        Method parent = HeapSort.class.getDeclaredMethod("parent", Integer.TYPE);
        parent.setAccessible(true);
        int input = 7;
        int expected = 3;
        Integer ret = (Integer) parent.invoke(null, input);
        Assert.assertEquals( new Long(expected), new Long(ret));
    }

    @Test
    public void test_parent_even() throws Exception {
        Method parent = HeapSort.class.getDeclaredMethod("parent", Integer.TYPE);
        parent.setAccessible(true);
        int input = 8;
        int expected = 3;
        Integer ret = (Integer) parent.invoke(null, input);
        Assert.assertEquals( new Long(expected), new Long(ret));
    }

    @Test
    public void test_left_odd() throws Exception {
        Method parent = HeapSort.class.getDeclaredMethod("left", Integer.TYPE);
        parent.setAccessible(true);
        int input = 4;
        int expected = 2*input+1;
        Integer ret = (Integer) parent.invoke(null, input);
        Assert.assertEquals( new Long(expected), new Long(ret));

    }

    @Test
    public void test_left_even() throws Exception {
        Method parent = HeapSort.class.getDeclaredMethod("left", Integer.TYPE);
        parent.setAccessible(true);
        int input = 5;
        int expected = 2*input+1;
        Integer ret = (Integer) parent.invoke(null, input);
        Assert.assertEquals( new Long(expected), new Long(ret));
    }

    @Test
    public void test_right_even() throws Exception {
        Method parent = HeapSort.class.getDeclaredMethod("right", Integer.TYPE);
        parent.setAccessible(true);
        int input = 3;
        int expected = 8;
        Integer ret = (Integer) parent.invoke(null, input);
        Assert.assertEquals( new Long(expected), new Long(ret));

    }

    @Test
    public void test_right_odd() throws Exception {
        Method parent = HeapSort.class.getDeclaredMethod("right", Integer.TYPE);
        parent.setAccessible(true);
        int input = 4;
        int expected = 10;
        Integer ret = (Integer) parent.invoke(null, input);
        Assert.assertEquals( new Long(expected), new Long(ret));

    }

    @Test
    public void test_private_left () {
        int actual = HeapSort.left(5);
        Assert.assertEquals( new Long(11), new Long(actual) );
    }

}