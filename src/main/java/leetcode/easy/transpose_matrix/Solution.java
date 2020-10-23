package leetcode.easy.transpose_matrix;

/**
 * https://leetcode.com/problems/transpose-matrix/
 */
public class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;

        int[][] answer = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                answer[j][i] = A[i][j];
            }
        }

        return answer;
    }
}
