package com.gecko.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMap implements TwoSum {

   public int[] exists (int[] valus, int target) {
      Map<Integer, Integer> map = new HashMap<> ();

      for (int i = 0; i < valus.length; i++) {
         map.put (valus[i], target-valus[i]);
      }

      for (Map.Entry<Integer, Integer> key : map.entrySet ()) {
         try {
            if (target - map.get (key.getKey ()) == map.get (map.get (key.getKey ()))) {
               return new int[]{map.get (key.getKey ()), map.get (map.get (key.getKey ()))};
            }
         } catch (Exception e) {
            // not a solution
         }
      }

      throw new IllegalArgumentException ("no solution");
   }
}
