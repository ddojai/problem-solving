package codility.FrogRiverOne;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        int sec = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                set.add(A[i]);
                if (set.size() == X)
                {
                    sec = i;
                    break;
                }
            }
        }
        return sec;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {1, 3, 1, 4, 2, 3, 5, 4};
        Solution solution = new Solution();
        int result = solution.solution(5, arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}