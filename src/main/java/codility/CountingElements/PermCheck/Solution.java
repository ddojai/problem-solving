package codility.CountingElements.PermCheck;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        for (int n : A) {
            if (n <= A.length) {
                B[n - 1] = 1;
            }
        }

        int isPermutation = 1;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0) {
                isPermutation = 0;
                break;
            }
        }

        return isPermutation;
    }

    public static void main(String[] args) throws IOException {

        int[] list = {4, 1, 3};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
