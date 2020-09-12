package leetcode.easy.find_numbers_with_even_number_of_digits;

/**
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                ret++;
            }
        }

        return ret;
    }
}
