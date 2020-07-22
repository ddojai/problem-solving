package leetcode.easy.tree.pathSum;

import leetcode.easy.tree.TreeNode;

public class Solution {
  public boolean hasPathSum(TreeNode root, int sum) {
    return pathSum(root, 0, sum);
  }

  private boolean pathSum(TreeNode node, int curr, int sum) {
    if (node == null) {
      return false;
    }

    curr += node.val;

    if (node.right == null && node.left == null) {
      return curr == sum;
    }

    boolean left = pathSum(node.left, curr, sum);
    boolean right = pathSum(node.right, curr, sum);

    return left || right;
  }
}
