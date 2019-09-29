package leetcode.problems.plusOne;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = solution.plusOne(arr);
        System.out.println(Arrays.toString(result));
    }
}
