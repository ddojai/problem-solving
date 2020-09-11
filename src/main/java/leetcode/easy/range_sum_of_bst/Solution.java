package leetcode.easy.range_sum_of_bst;

public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        if (root.left != null) {
            sum += rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            sum += rangeSumBST(root.right, L, R);
        }

        return sum;
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