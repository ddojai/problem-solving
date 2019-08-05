package codility.PrefixSums.PassingCars;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int cntP = 0;
        for (int n = 0; n < A.length; n++)
        {
            if (A[n] == 0)
            {
                cntP++;
            }
            else
            {
                count += cntP;
                if (count > 1000000000) {
                    count = -1;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        int[] list = {0, 1, 0, 1, 1};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
