package com.gecko.leetcode.twosum;

public class TwoSumBruteForce implements TwoSum {

   public int[] exists (int[] valus, int target) {

      for (int i = 0; i < valus.length; i++) {
         for (int j = i + 1; j < valus.length; j++) {

            if (valus[i] == target - valus[j]) {
               return new int[] {i, j};
            }
         }
      }

      throw new IllegalArgumentException("No solution found");
   }
}
