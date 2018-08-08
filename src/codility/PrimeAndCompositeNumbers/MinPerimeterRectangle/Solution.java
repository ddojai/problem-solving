package codility.PrimeAndCompositeNumbers.MinPerimeterRectangle;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {

    public int solution(int N) {
        // write your code in Java SE 8
        int a = 1;
        int minPerimeter = Integer.MAX_VALUE;
        while ((long)a * a <= N) {
            if (N % a == 0) {
                int b = N / a;
                int perimeter = 2 * (a + b);
                if (minPerimeter > perimeter) {
                    minPerimeter = perimeter;
                }
            }
            a += 1;
        }

        return minPerimeter;
    }

    public static void main(String[] args) throws IOException {
        int N = 20;
//        int N = 1;
        Solution solution = new Solution();
        int result = solution.solution(N);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
