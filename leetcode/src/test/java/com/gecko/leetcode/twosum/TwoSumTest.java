package com.gecko.leetcode.twosum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

   @Test
   public void test () {
      TwoSumBruteForce twoSum = new TwoSumBruteForce ();

      int[] vals = {1, 2, 5, 6, 9, 8};
      int target = 11;
      int [] sol = twoSum.exists (vals, target);
      Assert.assertNotNull(sol);

   }
}