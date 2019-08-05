package codility.MaximumSliceProblem.MaxProfit;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 2) {
            return 0;
        }

        int minPrice = 200000;
        int maxProfit = 0;

        for (int price : A) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) throws IOException {
        int list[] = {23171, 21011, 21123, 21366, 21013, 21367};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
