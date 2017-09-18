package com.gecko.leetcode.mapsum;

import java.util.HashMap;
import java.util.Map;

public class MapSumMyPrefixScore implements MapSum {

   Map<String, Integer> map = new HashMap<> ();

   public Object insert (String key, Integer value) {
      String prefix = "";
      for (char c : key.toCharArray ()) {
         prefix += c;
         Integer p_score = map.getOrDefault (prefix, 0);
         map.put (prefix, p_score + value);
      }

      //map.put(key, value);
      return null;
   }

   public Integer sum (String prefix) {
      return map.get (prefix);
   }
}
