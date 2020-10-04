package leetcode.easy.the_k_weakest_rows_in_a_matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int[] ret = new int[k];

        for (int row = 0; row < mat.length; row++) {
            int cnt = 0;
            for (int column = 0; column < mat[0].length; column++) {
                if (mat[row][column] == 1) {
                    cnt++;
                }
            }
            List<Integer> list = map.get(cnt);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(row);
            map.put(cnt, list);
        }

        int idx = 0;
        loop:
        for (int key : map.keySet()) {
            List<Integer> row = map.get(key);
            for (int num : row) {
                ret[idx++] = num;
                if (idx == k) {
                    break loop;
                }
            }
        }

        return ret;
    }
}
