package com.gecko.algorithms.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/24/16.
 */
public class BucketSortTest {

    @Test
    public void sort() throws Exception {
        Double[] input = {1.2, 4.5, 7.8,  8.9, 10.1, 5.4, 3.4, 6.5};
        Double[] expected = {1.2, 3.4, 4.5, 5.4, 6.5, 7.8, 8.9, 10.1};

        Double[] ret = BucketSort.sort(input);
        Assert.assertArrayEquals( ret, expected );
    }

}