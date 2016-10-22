package com.gecko.algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

//import javax.lang.model.type.ArrayType;
//import java.lang.reflect.Array;
import java.lang.reflect.Method;

import static java.sql.Types.INTEGER;


/**
 * Created by hlieu on 10/22/16.
 */
public class QuickSortTailTest {

    @Test
    public void test_max1() throws Exception {
        Method max = QuickSortTail.class.getDeclaredMethod("max", Comparable[].class, Integer.TYPE, Integer.TYPE);
        max.setAccessible(true);
        Comparable[] ints = new Comparable[]{1, 5, 19};
        Object[] params = {ints, 0, 2};
        int max_i = (Integer) max.invoke(null, params);
        Assert.assertTrue(max_i == 2);
    }

    @Test
    public void test_max2() throws Exception {
        Method max = QuickSortTail.class.getDeclaredMethod("max", Comparable[].class, Integer.TYPE, Integer.TYPE);
        max.setAccessible(true);
        Comparable[] ints = new Comparable[]{110, 5, 19};
        Object[] params = {ints, 0, 2};
        int max_i = (Integer) max.invoke(null, params);
        Assert.assertTrue(max_i == 0);
    }

    @Test
    public void test_partition() throws Exception {
        Method max = QuickSortTail.class.getDeclaredMethod("partition", Comparable[].class, Integer.TYPE, Integer.TYPE);
        max.setAccessible(true);
        Comparable[] ints = new Comparable[]{110, 5, 19};
        Object[] params = {ints, 0, 2};
        int max_i = (Integer) max.invoke(null, params);

        Comparable[] expected = {19, 5, 110};
        Assert.assertArrayEquals(expected, ints);
        Assert.assertEquals(new Long(max_i), new Long(2));
    }

    @Test
    public void test_private_sort() throws Exception {
        Method sort = QuickSortTail.class.getDeclaredMethod("sort", Comparable[].class, Integer.TYPE, Integer.TYPE);
        sort.setAccessible(true);
        Comparable[] ints = new Comparable[]{110, 5, 19};
        Object[] params = {ints, 0, 2};
        sort.invoke(null, params);

        Comparable[] expected = {5, 19, 110};

        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void test_private_sort2() throws Exception {
        Method sort = QuickSortTail.class.getDeclaredMethod("sort", Comparable[].class, Integer.TYPE, Integer.TYPE);
        sort.setAccessible(true);
        Comparable[] ints = new Comparable[]{110, 5, 19, 110};
        Object[] params = {ints, 0, 3};
        sort.invoke(null, params);

        Comparable[] expected = {5, 19, 110 ,110};

        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void test_sort() throws Exception {
        //Method sort = QuickSortTail.class.getDeclaredMethod("sort", Comparable[].class, Integer.TYPE, Integer.TYPE);
        //sort.setAccessible(true);
        Comparable[] ints = new Comparable[]{110, 5, 19, 110};
        //Object[] params = {ints, 0, 3};
        QuickSortTail.sort(ints);

        Comparable[] expected = {5, 19, 110 ,110};

        Assert.assertArrayEquals(expected, ints);
    }

    @Test
    public void test_sort2() throws Exception {
        Comparable[] ints = new Comparable[]{110, 5, 19, 110, 18, 20, 0};
        QuickSortTail.sort(ints);

        Comparable[] expected = {0, 5, 18, 19, 20, 110 ,110};

        Assert.assertArrayEquals(expected, ints);
    }

}