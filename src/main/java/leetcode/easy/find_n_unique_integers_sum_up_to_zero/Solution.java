package leetcode.easy.find_n_unique_integers_sum_up_to_zero;

/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class Solution {
    public int[] sumZero(int n) {
        int[] ret = new int[n];
        if (n % 2 == 0) {
            ret[0] = -(n / 2);
            for (int i = 1; i < n; i++) {
                ret[i] = ret[i - 1] + 1;
                if (ret[i] == 0) {
                    ret[i] += 1;
                }
            }
        } else {
            ret[0] = -(n / 2);
            for (int i = 1; i < n; i++) {
                ret[i] = ret[i - 1] + 1;
            }
        }

        return ret;
    }
}
