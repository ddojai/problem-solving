package leetcode.easy.climbingStairs;

public class Solution {
  /* brute force
  private int recursive(int n, int curr) {
    if (n == curr) {
      return 1;
    } else if (n < curr) {
      return 0;
    }

    return recursive(n, curr + 1) + recursive(n, curr + 2);
  }
   */

  public int climbStairs(int n) {
    int[] memo = new int[n + 1];
    return memoization(n, 0, memo);
  }

  private int memoization(int n, int curr, int[] memo) {
    if (n == curr) {
      return 1;
    } else if (n < curr) {
      return 0;
    }
    if (memo[curr] > 0) {
      return memo[curr];
    }
    memo[curr] = memoization(n, curr + 1, memo)
      + memoization(n, curr + 2, memo);
    return memo[curr];
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.climbStairs(3);
    System.out.println(result);
  }
}
