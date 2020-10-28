package leetcode.easy.element_appearing_more_than_25_in_sorted_array;

/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 */
public class Solution {
    public int findSpecialInteger(int[] arr) {
        int ceil = (int) Math.ceil((double) arr.length / 4);
        int cnt = 0;
        int curr = -1;
        for (int num : arr) {
            if (curr != num) {
                curr = num;
                cnt = 1;
            } else {
                cnt++;
            }
            if (cnt > ceil) {
                break;
            }
        }

        return curr;
    }
}
