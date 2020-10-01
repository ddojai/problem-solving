package leetcode.easy.delete_columns_to_make_sorted;

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted
 */
public class Solution {
    public int minDeletionSize(String[] A) {
        int ret = 0;
        int N = A[0].length();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    ret++;
                    break;
                }
            }
        }

        return ret;
    }
}
