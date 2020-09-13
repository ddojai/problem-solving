package leetcode.easy.matrix_diagonal_sum;

/**
 * 1572. Matrix Diagonal Sum
 * https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == len - 1) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}
