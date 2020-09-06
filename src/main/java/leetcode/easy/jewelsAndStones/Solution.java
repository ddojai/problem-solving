package leetcode.easy.jewelsAndStones;

/**
 * 2중 for문 사용
 * 771. Jewels and Stones
 * https://leetcode.com/problems/jewels-and-stones
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int ret = 0;

        for (int j = 0; j < J.length(); j++) {
            char jewel = J.charAt(j);
            for (int s = 0; s < S.length(); s++) {
                if (jewel == S.charAt(s)) {
                    ret++;
                }
            }
        }

        return  ret;
    }
}
