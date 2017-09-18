package com.gecko.leetcode.mapsum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapSumPrefixScoreTest {

   @Test
   public void test () {
      MapSum mapSum = new MapSumPrefixScore ();
      mapSum.insert ("apple", 5);
      Integer sum = mapSum.sum("apple");
      Assert.assertEquals (sum.intValue (), 5);

      mapSum.insert ("app", 2);
      sum = mapSum.sum ("app");
      Assert.assertEquals (sum.intValue (), 7);

      mapSum.insert ("ap", 1);
      sum = mapSum.sum ("ap");
      Assert.assertEquals (sum.intValue (), 8);
   }
}