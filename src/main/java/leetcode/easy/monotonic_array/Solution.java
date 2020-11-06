package leetcode.easy.monotonic_array;

/**
 * https://leetcode.com/problems/monotonic-array/
 */
public class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                increasing = true;
            } else if (A[i] > A[i + 1]) {
                decreasing = true;
            }
        }

        return !increasing || !decreasing;
    }
}
