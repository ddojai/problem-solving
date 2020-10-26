package leetcode.easy.sum_of_even_numbers_after_queries;

/**
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */
public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int initialSum = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                initialSum += num;
            }
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int val = query[0];
            int index = query[1];

            if (A[index] % 2 == 0) {
                initialSum -= A[index];
            }
            A[index] = A[index] + val;
            if (A[index] % 2 == 0) {
                initialSum += A[index];
            }
            answer[i] = initialSum;
        }

        return answer;
    }
}
