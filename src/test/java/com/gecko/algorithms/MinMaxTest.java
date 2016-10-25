package com.gecko.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/24/16.
 */
public class MinMaxTest {
    @Test
    public void test_min_max() {
        Integer[] inputs = {1, 4, 6, 12, 11, 15, 18, 2};
        Integer[] min_max = MinMax.min_max_find(inputs);
        Assert.assertEquals(new Long(1), new Long(min_max[0]));
        Assert.assertEquals(new Long(18), new Long(min_max[1]));
    }

    @Test
    public void test_min_max_odd() {
        Integer[] inputs = {4, 6, 12, 11, 15, 18, 2};
        Integer[] min_max = MinMax.min_max_find(inputs);
        Assert.assertEquals(new Long(2), new Long(min_max[0]));
        Assert.assertEquals(new Long(18), new Long(min_max[1]));
    }

}