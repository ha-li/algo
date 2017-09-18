package com.gecko.leetcode.mapsum;

import org.junit.Assert;
import org.junit.Test;

public class MapSumBruteForceTest {

   @Test
   public void test_sum() {
      MapSum bruteForce = new MapSumBruteForce ();

      bruteForce.insert ("app", 5);
      Integer sum = bruteForce.sum ("app");
      Assert.assertEquals (sum.intValue (), 5);

      bruteForce.insert ("apple", 2);
      sum = bruteForce.sum ("app");
      Assert.assertEquals (sum.intValue (), 7);

   }
}