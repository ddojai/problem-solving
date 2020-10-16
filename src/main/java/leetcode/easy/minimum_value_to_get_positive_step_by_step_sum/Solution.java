package leetcode.easy.minimum_value_to_get_positive_step_by_step_sum;

/**
 * https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 */
public class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum < min) {
                min = sum;
            }
        }

        return Math.abs(min) + 1;
    }
}
