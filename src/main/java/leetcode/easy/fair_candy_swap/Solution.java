package leetcode.easy.fair_candy_swap;

/**
 * https://leetcode.com/problems/fair-candy-swap/
 */
public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        for (int n : A) {
            sumA += n;
        }
        for (int n : B) {
            sumB += n;
        }
        int[] answer = new int[2];
        loop :for (int a : A) {
            for (int b : B) {
                if (sumA - a + b == sumB - b + a) {
                    answer[0] = a;
                    answer[1] = b;
                    break loop;
                }
            }
        }

        return answer;
    }
}
