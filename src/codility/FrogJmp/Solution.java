package codility.FrogJmp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if (Y == X)
            return 0;
        else {
            int value = (Y - X) / D;
            int remainder = (Y - X) % D;
            if (remainder == 0) {
                return value;
            } else {
                return value + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        int result = solution.solution(10, 85, 30);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
