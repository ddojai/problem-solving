package leetcode.easy.peak_index_in_a_mountain_array;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/discuss/865172/Easiest-Java-solution-faster-that-100
 */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int mountain = 0;
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (peak < arr[i]) {
                peak = arr[i];
                mountain = i;
            }
        }

        return mountain;
    }
}
