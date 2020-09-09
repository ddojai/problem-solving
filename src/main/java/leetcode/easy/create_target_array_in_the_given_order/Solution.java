package leetcode.easy.create_target_array_in_the_given_order;

import java.util.LinkedList;

/**
 * 1389. Create Target Array in the Given Order
 * https://leetcode.com/problems/create-target-array-in-the-given-order
 */
public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> ret = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            ret.add(index[i], (nums[i]));
        }

        return ret.stream().mapToInt(i -> i).toArray();
    }
}