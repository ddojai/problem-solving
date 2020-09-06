package leetcode.easy.number_of_steps_to_reduce_a_number_to_zero;

/**
 * while 사용
 * 1342. Number of Steps to Reduce a Number to Zero
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class Solution {
    public int numberOfSteps (int num) {
        int ret = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            ret++;
        };

        return ret;
    }
}