package leetcode.problems.mergeSortedArray;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/submissions/
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            int[] merge = new int[m + n];
            int index = 0, index1 = 0, index2 = 0;
            while (index1 < m && index2 < n) {
                if (nums2[index2] > nums1[index1]) {
                    merge[index] = nums1[index1];
                    index1++;
                } else {
                    merge[index] = nums2[index2];
                    index2++;
                }
                index++;
            }
            while (index1 < m) {
                merge[index] = nums1[index1];
                index1++;
                index++;
            }

            while (index2 < n) {
                merge[index] = nums2[index2];
                index2++;
                index++;
            }

            System.arraycopy(merge, 0, nums1, 0, m + n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] num1 = {2, 0};
        int m = 1;
        int[] num2 = {1};
        int n = 1;

        solution.merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }
}
