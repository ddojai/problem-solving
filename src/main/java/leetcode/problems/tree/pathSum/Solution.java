package leetcode.problems.tree.pathSum;

import leetcode.problems.tree.TreeNode;

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
      if (curr == sum) {
        return true;
      }
      return false;
    }

    boolean left = pathSum(node.left, curr, sum);
    boolean right = pathSum(node.right, curr, sum);

    return left || right;
  }
}
