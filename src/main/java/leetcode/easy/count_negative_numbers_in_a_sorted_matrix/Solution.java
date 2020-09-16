package leetcode.easy.count_negative_numbers_in_a_sorted_matrix;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Solution {
    public int countNegatives(int[][] grid) {
        int ret = 0;
        for (int[] rows : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (rows[j] < 0) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
