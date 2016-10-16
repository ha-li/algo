package com.gecko.algorithms.sort;

import com.gecko.PrintUtils;
import com.gecko.RandomUtils;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/16/16.
 */
public class InsertionSortTest {

    @Test
    public void sort() throws Exception {
        Integer[] ints = new Integer[20];
        RandomUtils.populate(ints, 1, 99);
        PrintUtils.display(ints);
        InsertionSort.sort(ints);
        PrintUtils.display(ints);

        assertTrue(SortValidation.isSorted(ints));
        
    }

}