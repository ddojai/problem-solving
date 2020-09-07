package leetcode.easy.shuffle_string;

/**
 * 1528. Shuffle String
 * https://leetcode.com/problems/shuffle-string/
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ret = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int idx = indices[i];
            ret[idx] = s.charAt(i);
        }

        return new String(ret);
    }
}
