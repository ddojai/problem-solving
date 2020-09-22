package leetcode.easy.hamming_distance;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String binaryY = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        System.out.println(binaryX);
        System.out.println(binaryY);
        int ret = 0;
        for (int i = 0; i < binaryX.length(); i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i)) {
                ret++;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ret = solution.hammingDistance(1577962638, 1727613287);
        System.out.println(ret);
    }
}
