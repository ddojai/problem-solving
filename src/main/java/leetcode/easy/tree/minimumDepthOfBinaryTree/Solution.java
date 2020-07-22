package leetcode.easy.tree.minimumDepthOfBinaryTree;

import leetcode.easy.tree.TreeNode;

public class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    return getDepth(root, 1);
  }

  private int getDepth(TreeNode node, int depth) {
    if (node == null) {
      return Integer.MAX_VALUE;
    }

    if (node.left == null && node.right == null) {
      return depth;
    }

    int left = getDepth(node.left, depth + 1);
    int right = getDepth(node.right, depth + 1);

    return Math.min(left, right);
  }
}
