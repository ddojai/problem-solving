package leetcode.easy.sort_array_by_parity_ii;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        Deque<Integer> oddStack = new LinkedList<>();
        Deque<Integer> evenStack = new LinkedList<>();
        for (int n : A) {
            if (n % 2 == 0) {
                evenStack.push(n);
            } else {
                oddStack.push(n);
            }
        }

        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                ret[i] = evenStack.pop();
            } else {
                ret[i] = oddStack.pop();
            }
        }

        return ret;
    }
}
