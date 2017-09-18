package com.gecko.leetcode.mapsum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapSumMyPrefixScoreTest {

   @Test
   public void test () {
      MapSum map = new MapSumMyPrefixScore();
      map.insert("apple", 5);
      Integer sum = map.sum ("app");
      Assert.assertEquals (sum.intValue (), 5);

      map.insert ("app", 2);
      sum = map.sum ("app");
      Assert.assertEquals (sum.intValue (), 7);

      map.insert ("ap", 1);
      sum = map.sum ("ap");
      Assert.assertEquals (sum.intValue (), 8);
   }

}