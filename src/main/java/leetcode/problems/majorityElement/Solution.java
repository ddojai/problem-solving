package leetcode.problems.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(result);
    }
}