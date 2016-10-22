package com.gecko.algorithms.merge;

import com.gecko.PrintUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/17/16.
 */
public class Merge2Test {
    @Test
    public void merge_emptyArray() throws Exception {

        Integer[] a1 = new Integer[] {2, 4};
        Integer[] a2 = new Integer[] {};
        Integer[] result = Merge2.merge(a1, a2);

        PrintUtils.display(result);
    }

    @Test
    public void merge_emptyArrayReverse() throws Exception {

        Integer[] a1 = new Integer[] {2, 4};
        Integer[] a2 = new Integer[] {};
        Integer[] result = Merge2.merge(a2, a1);

        PrintUtils.display(result);
    }

    @Test
    public void merge_twoArray() throws Exception {

        Integer[] a1 = new Integer[] {2, 4};
        Integer[] a2 = new Integer[] {2, 3, 4};
        Integer[] result = Merge2.merge(a2, a1);

        PrintUtils.display(result);
    }
}