package leetcode.easy.tree.maximumDepthOfBinaryTree;

import leetcode.easy.tree.TreeNode;

public class Solution {
  public int maxDepth(TreeNode root) {
    return treeDepth(root, 0);
  }

  private int treeDepth(TreeNode tree, int depth) {
    if (tree == null) {
      return depth;
    }
    if (tree.left == null && tree.right == null) {
      return depth + 1;
    }
    int left = treeDepth(tree.left, depth + 1);
    int right = treeDepth(tree.right, depth + 1);

    return Math.max(left, right);
  }
}
