package leetcode.easy.make_two_arrays_equal_by_reversing_sub_arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays
 */
public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target, arr);
    }
}
