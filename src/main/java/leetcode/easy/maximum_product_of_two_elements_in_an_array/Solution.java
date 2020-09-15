package leetcode.easy.maximum_product_of_two_elements_in_an_array;

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = (nums[i] - 1) * (nums[j] - 1);
                if (product > max) {
                    max = product;
                }
            }
        }

        return max;
    }
}
