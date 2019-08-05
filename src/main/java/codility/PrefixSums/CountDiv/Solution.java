package codility.PrefixSums.CountDiv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        // A = 11, B = 345, K = 17
        // A = B in {0,1}, K = 11   1, 0
        // A = 10, B = 10, K in {5,7,20} 1, 0, 0
        // A = 0, B = MAXINT, K in {1,MAXINT}
        int cnt;

        if (A == B) {
            cnt = ((B % K) == 0) ? 1: 0;
        }
        else {
            if (A <= K)
            {
                cnt = B / K;
                if (A == 0) {
                    cnt += 1;
                }
            }
            else
            {
                if (A % K != 0)
                {
                    A = ((A / K) + 1) * K;
                }
                cnt = ((B - A) / K) + 1;
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {

        Solution solution = new Solution();
        int result = solution.solution(0, 2000000000, 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
