package leetcode.easy.height_checker;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/height-checker
 */
public class Solution {
    public int heightChecker(int[] heights) {
        int[] target = Arrays.copyOf(heights, heights.length);
        Arrays.sort(target);
        int ret = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != target[i]) {
                ret++;
            }
        }

        return ret;
    }
}
