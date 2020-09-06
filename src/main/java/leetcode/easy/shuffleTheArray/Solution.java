package leetcode.easy.shuffleTheArray;

import java.util.Arrays;

/**
 * x, y 인덱스를 변수로 추가해서 해결
 * 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ret = new int[nums.length];

        int xIdx = 0;
        int yIdx = n;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ret[i] = nums[xIdx];
                xIdx++;
            } else {
                ret[i] = nums[yIdx];
                yIdx++;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};

        Solution solution = new Solution();
        int[] ret = solution.shuffle(nums, 3);
        System.out.println(Arrays.toString(ret));
    }
}
