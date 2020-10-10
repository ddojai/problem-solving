package leetcode.easy.univalued_binary_tree;

/**
 * https://leetcode.com/problems/univalued-binary-tree/
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        boolean left = isSame(root.left, value);
        boolean right = isSame(root.right, value);

        return left && right;
    }

    public boolean isSame(TreeNode root, int value) {
        if (root == null) {
            return true;
        }

        if (root.val != value) {
            return false;
        }

        boolean left = isSame(root.left, value);
        boolean right = isSame(root.right, value);

        return left && right;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}