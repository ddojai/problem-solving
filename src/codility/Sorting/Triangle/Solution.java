package codility.Sorting.Triangle;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int isTriangle = 0;
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            int p = A[i];
            int q = A[i-1];
            int r = A[i-2];
            if ((long)p + q > r) {
                if ((long)q + r > p) {
                    if ((long)r + p > q) {
                        isTriangle = 1;
                        break;
                    }
                }
            }
        }

        return isTriangle;
    }

    public static void main(String[] args) throws IOException {

//        int[] list = {10, 2, 5, 1, 8, 20};
        int[] list = {10, 50, 5, 1};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
