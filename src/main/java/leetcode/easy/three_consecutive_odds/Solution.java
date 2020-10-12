package leetcode.easy.three_consecutive_odds;

/**
 * https://leetcode.com/problems/three-consecutive-odds/
 */
public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCnt = 0;
        boolean answer = false;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddCnt++;
                if (oddCnt == 3) {
                    answer = true;
                    break;
                }
            } else {
                oddCnt = 0;
            }
        }

        return answer;
    }
}
