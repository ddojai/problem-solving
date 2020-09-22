package leetcode.easy.di_string_match;

/**
 * https://leetcode.com/problems/di-string-match/
 */
public class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] ret = new int[N + 1];
        int start = 0;
        int end = N;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                ret[i] = start++;
            } else {
                ret[i] = end--;
            }
        }
        ret[N] = start; // end도 상관없음

        return ret;
    }
}
