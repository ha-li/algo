package com.gecko.leetcode.mapsum;

import java.util.HashMap;
import java.util.Map;

/**
 * In this implementation of MapSum, we are keeping a map of
 * all the substrings and their score up to that time.
 */
public class MapSumPrefixScore implements MapSum {

   private Map<String, Integer> score = new HashMap <> ();
   private Map<String, Integer> map = new HashMap <> ();

   public Object insert (String key, Integer value) {
      Integer delta = value - map.getOrDefault (key, 0);
      map.put (key, value);

      String prefix = "";
      for ( char c : key.toCharArray () ) {
         prefix += c;
         Integer newScore = delta + score.getOrDefault (prefix, 0);
         score.put (prefix, newScore);
      }

      return null;
   }

   public Integer sum (String prefix) {
      return score.get(prefix);
   }
}

