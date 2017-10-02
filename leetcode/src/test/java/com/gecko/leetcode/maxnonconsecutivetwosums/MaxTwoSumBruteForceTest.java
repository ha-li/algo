package com.gecko.leetcode.maxnonconsecutivetwosums;

import org.junit.Assert;
import org.junit.Test;

public class MaxTwoSumBruteForceTest {
   @Test
   public void test () {
      MaxTwoSumBruteForce twoSum = new MaxTwoSumBruteForce ();
      int[] sol = twoSum.twoSums (new int[] {0, 2});
      Assert.assertArrayEquals(sol, new int[] {-1, -1});
   }

   @Test
   public void test2 () {
      MaxTwoSumBruteForce twoSum = new MaxTwoSumBruteForce ();
      int[] sol = twoSum.twoSums (new int[] {1, 90, 100, 91});
      Assert.assertArrayEquals(sol, new int[] {1, 3});
   }

   @Test
   public void test3 () {
      MaxTwoSumBruteForce twoSum = new MaxTwoSumBruteForce ();
      int[] sol = twoSum.twoSums (new int[] {89, 90, 92, 91});
      Assert.assertArrayEquals(sol, new int[] {0, 2});
   }
}