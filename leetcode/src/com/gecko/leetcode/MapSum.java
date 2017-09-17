package com.gecko.leetcode;

/**
 * implement a map sum class with 2 methods:
 * 1. insert
 * 2. sum
 *
 * insert (String, Integer) the string represents the key, and the
 * integer the value. If the key already exists, then the original
 * value is overridden with the new one.
 *
 * sum (String) - you'll be presented with a prefix, and you need
 * to return the sum of all the values whose key starts with the prefix
 *
 * Input: insert ("apple", 3) Output: Null
 * Input: sum ("ap"), Output: 3
 * Input: insert ("app", 2), Output Null
 * Input: sum ("ap"), Output 5
 *
 */
public class MapSum {
   private Map <String, Integer> map = new HashMap<>();

   public Object insert (String key, Integer value){
      map.put (key, value);
   }


   public Integer sum (String prefix){
      int sum = 0;
      for (Map.Entry entries = map.entry ()) {

      }
   }
}
