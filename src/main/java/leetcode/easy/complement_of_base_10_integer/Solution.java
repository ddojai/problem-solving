package leetcode.easy.complement_of_base_10_integer;

/**
 * https://leetcode.com/problems/complement-of-base-10-integer/
 */
public class Solution {
    public int bitwiseComplement(int N) {
        String num = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for (char c : num.toCharArray()) {
            if (c == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
