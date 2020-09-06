package leetcode.easy.how_many_numbers_are_smaller_than_the_current_number;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            int num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (num > nums[j]) {
                    cnt++;
                }
            }

            ret[i] = cnt;
        }

        return ret;
    }
}