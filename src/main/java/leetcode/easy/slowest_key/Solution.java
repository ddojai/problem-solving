package leetcode.easy.slowest_key;

/**
 * https://leetcode.com/problems/slowest-key/
 */
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char result = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int releaseTime = releaseTimes[i] - releaseTimes[i - 1];
            if (releaseTime > max) {
                max = releaseTime;
                result = keysPressed.charAt(i);
            } else if (releaseTime == max && result < keysPressed.charAt(i)) {
                result = keysPressed.charAt(i);
            }
        }

        return result;
    }
}
