package leetcode.easy.mean_of_array_after_removing_some_elements;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
 */
public class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int remove = arr.length / 20;
        double sum = 0;
        for (int i = remove; i < arr.length - remove; i++) {
            sum += arr[i];
        }

        return sum / (arr.length - remove * 2);
    }
}
