package leetcode.easy.removeElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = solution.removeElement(nums, val);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
