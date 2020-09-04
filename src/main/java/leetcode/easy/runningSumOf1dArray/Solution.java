package leetcode.easy.runningSumOf1dArray;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class Solution {
  public int[] runningSum(int[] nums) {
    int[] ret = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < i + 1; j++) {
        ret[i] += nums[j];
      }
    }

    return ret;
  }
}
