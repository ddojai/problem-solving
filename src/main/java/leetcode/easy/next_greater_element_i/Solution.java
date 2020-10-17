package leetcode.easy.next_greater_element_i;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            answer[i] = -1;
            for (int num : nums2) {
                if (flag && nums1[i] < num) {
                    answer[i] = num;
                    break;
                } else if (nums1[i] == num) {
                    flag = true;
                }
            }
        }

        return answer;
    }
}
