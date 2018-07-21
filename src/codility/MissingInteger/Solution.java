package codility.MissingInteger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        for (int n : A) {
            if (1 <= n && n <= A.length) {
                B[n - 1] = 1;
            }
        }

        int min = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0) {
                min = i + 1;
                break;
            }
        }
        if (min == 0) {
            min = B.length + 1;
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {1, 3, 6, 4, 1, 2};
        Solution solution = new Solution();
        int result = solution.solution(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}