package leetcode.easy.maximum_69_number;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class Solution {
    public int maximum69Number (int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }
}
