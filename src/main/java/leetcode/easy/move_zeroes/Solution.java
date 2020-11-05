package leetcode.easy.move_zeroes;

/**
 * https://leetcode.com/problems/move-zeroes
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (curr == i) {
                    curr++;
                    continue;
                }
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
                curr++;
            }
        }
    }
}
