package leetcode.problems.tree.convertSortedArrayToBinarySearchTree;

import leetcode.problems.tree.TreeNode;

/**
 * https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 */
public class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length - 1);
  }

  private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }

    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = sortedArrayToBST(nums, start, mid - 1);
    node.right = sortedArrayToBST(nums, mid + 1, end);

    return node;
  }
}
