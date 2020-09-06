package leetcode.easy.numberOfGoodPairs;

/**
 * 이중 for문 체크
 * 1512. Number of Good Pairs
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
