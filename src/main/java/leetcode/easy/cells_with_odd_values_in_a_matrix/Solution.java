package leetcode.easy.cells_with_odd_values_in_a_matrix;

/**
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * 1252. Cells with Odd Values in a Matrix
 */
public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] cells = new int[n][m];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int column = indices[i][1];

            for (int ri = 0; ri < n; ri++) {
                cells[ri][column]++;
            }
            for (int ci = 0; ci < m; ci++) {
                cells[row][ci]++;
            }
        }

        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cells[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
