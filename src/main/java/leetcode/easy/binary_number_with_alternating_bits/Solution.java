package leetcode.easy.binary_number_with_alternating_bits;

/**
 * https://leetcode.com/problems/binary-number-with-alternating-bits/
 */
public class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        boolean isAlternating = true;
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.charAt(i) == binary.charAt(i + 1)) {
                isAlternating = false;
                break;
            }
        }

        return isAlternating;
    }
}
