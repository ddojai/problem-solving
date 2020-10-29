package leetcode.easy.consecutive_characters;

/**
 * https://leetcode.com/problems/consecutive-characters/
 */
public class Solution {
    public int maxPower(String s) {
        char curr = '0';
        int max = 0;
        int consecutive = 0;
        for (char c : s.toCharArray()) {
            if (curr == c) {
                consecutive++;
            } else {
                curr = c;
                consecutive = 1;
            }
            max = Math.max(max, consecutive);
        }

        return max;
    }
}
