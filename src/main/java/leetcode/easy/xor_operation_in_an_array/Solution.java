package leetcode.easy.xor_operation_in_an_array;

/**
 * 1486. XOR Operation in an Array
 * https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class Solution {
    public int xorOperation(int n, int start) {
        int ret = 0;
        for (int i = 0; i < n; i++) {
             ret ^= start + i * 2;
        }

        return ret;
    }
}