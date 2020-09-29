package leetcode.easy.lucky_numbers_in_a_matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 */
public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer, Integer> minimumByRow = new HashMap<>();
        for (int row = 0; row < matrix.length; row++) {
            int min = matrix[row][0];
            int minColumn = 0;
            for (int column = 1; column < matrix[0].length; column++) {
                if (min > matrix[row][column]) {
                    min = matrix[row][column];
                    minColumn = column;
                }
            }
            minimumByRow.put(row, minColumn);
        }

        List<Integer> ret = new ArrayList<>();
        for (int column = 0; column < matrix[0].length; column++) {
            int max = matrix[0][column];
            int maxRow = 0;
            for (int row = 1; row < matrix.length; row++) {
                if (max < matrix[row][column]) {
                    max = matrix[row][column];
                    maxRow = row;
                }
            }
            int minimumColumn = minimumByRow.get(maxRow);
            if (minimumColumn == column) {
                ret.add(max);
            }
        }

        return ret;
    }
}
