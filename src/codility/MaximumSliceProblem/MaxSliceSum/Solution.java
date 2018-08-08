package codility.MaximumSliceProblem.MaxSliceSum;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {

    public int solution(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : A) {
            sum += num;
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        int list[] = {3, 2, -6, 4, 0};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
