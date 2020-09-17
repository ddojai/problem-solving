package leetcode.easy.replace_elements_with_greatest_element_on_right_side;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }

        return arr;
    }
}
