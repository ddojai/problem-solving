package leetcode.easy.find_lucky_integer_in_an_array;

/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 */
public class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];
        for (int num : arr) {
            nums[num]++;
        }

        for (int i = 500; i >= 1; i--) {
            if (nums[i] == i) {
                return i;
            }
        }

        return -1;
    }
}
