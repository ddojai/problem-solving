package leetcode.easy.sort_array_by_parity;

/**
 * https://leetcode.com/problems/sort-array-by-parity
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ret = new int[A.length];
        int evenIdx = 0;
        int oddIdx = A.length - 1;
        for (int num : A) {
            if (num % 2 == 0) {
                ret[evenIdx++] = num;
            } else {
                ret[oddIdx--] = num;
            }
        }

        return ret;
    }
}
