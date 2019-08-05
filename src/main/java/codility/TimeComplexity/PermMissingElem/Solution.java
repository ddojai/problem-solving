package codility.TimeComplexity.PermMissingElem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[A.length + 1];
        for (int n : A) {
            B[n - 1] = 1;
        }

        int num = -1;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0) {
                num = i + 1;
            }
        }
        return num;
    }

    public static void main(String[] args) throws IOException {

        int[] list = {2, 3, 1, 5};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
