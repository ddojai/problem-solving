package codility.MaximumSliceProblem.MaxDoubleSliceSum;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int[] s1 = new int[len];
        int[] s2 = new int[len];

        for (int i = 1; i < len - 1; i++) {
            s1[i] = Math.max(s1[i - 1] + A[i], 0);
        }
        for (int i = len - 2; i > 0; i--) {
            s2[i] = Math.max(s2[i + 1] + A[i], 0);
        }

        int result = 0;
        for (int i = 1; i < len - 1; i++) {
            result = Math.max(s1[i - 1] + s2[i + 1], result);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        int list[] = {3, 2, 6, -1, 4, 5, -1, 2};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
