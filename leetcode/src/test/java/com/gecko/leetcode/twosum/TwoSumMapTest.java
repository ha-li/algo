package com.gecko.leetcode.twosum;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumMapTest {

   @Test(expected = IllegalArgumentException.class)
   public void test () {
      TwoSum twoSum = new TwoSumMap ();
      int[] vals = {1, 2, 3, 5, 7, 9};
      int target = 13;
      int[] sol = twoSum.exists (vals, target);
   }
}