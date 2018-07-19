package codility.TapeEquilibrium;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int afterSum = 0;
        int prevSum = 0;
        for (int n : A) {
            afterSum += n;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            prevSum += A[i];
            afterSum -= A[i];
            int value = Math.abs(prevSum - afterSum);
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static void main(String[] args) throws IOException {

//        int[] list = {3, 1, 2, 4, 3};
        int[] list = {-1000, 1000};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
