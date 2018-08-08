package codility.PrimeAndCompositeNumbers.CountFactors;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {

    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int result = 0;
        while ((long)i * i < N) {
            if (N % i == 0) {
                result += 2;
            }
            i += 1;
        }
        if (i * i == N) {
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
//        int N = 1000000000;
        int N = Integer.MAX_VALUE;
//        int N = 24;
        Solution solution = new Solution();
        int result = solution.solution(N);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
