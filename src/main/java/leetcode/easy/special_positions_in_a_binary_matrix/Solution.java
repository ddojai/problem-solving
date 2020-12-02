package leetcode.easy.special_positions_in_a_binary_matrix;

/**
 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/
 */
public class Solution {
    public int numSpecial(int[][] mat) {
        int answer = 0;

        for (int[] row1 : mat) {
            int cntByRow = 0;
            int colIndex = 0;
            for (int col = 0; col < row1.length; col++) {
                if (row1[col] == 1) {
                    cntByRow++;
                    colIndex = col;
                }
            }

            if (cntByRow == 1) {
                int cntByCol = 0;
                for (int[] row2 : mat) {
                    if (row2[colIndex] == 1) {
                        cntByCol++;
                    }
                }
                if (cntByCol == 1) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
