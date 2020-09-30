package leetcode.easy.sum_of_root_to_leaf_binary_numbers;

/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = sum(root.left, String.valueOf(root.val));
        int right = sum(root.right, String.valueOf(root.val));

        return left + right;
    }

    private int sum(TreeNode root, String str) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return Integer.parseInt(str + root.val, 2);
        }

        int left = sum(root.left, str + root.val);
        int right = sum(root.right, str + root.val);

        return left + right;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}