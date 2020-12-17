package leetcode.easy.convert_integer_to_the_sum_of_two_no_zero_integers;

/**
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 */
public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")) {
                result[0] = a;
                result[1] = b;
            }
        }

        return result;
    }
}
