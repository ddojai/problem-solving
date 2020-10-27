package leetcode.easy.binary_gap;

/**
 * https://leetcode.com/problems/binary-gap/
 */
public class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int gap = 0;
        int index = 0;
        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (i - index > gap) {
                    gap = i - index;
                }
                index = i;
            }
        }

        return gap;
    }
}
