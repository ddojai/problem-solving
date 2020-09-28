package leetcode.easy.increasing_order_search_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);

        TreeNode result = new TreeNode(0);
        TreeNode temp = result;
        for (int num : list) {
            temp.right = new TreeNode(num);
            temp = temp.right;
        }

        return result.right;
    }

    public static void traversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        traversal(node.left, list);
        list.add(node.val);
        traversal(node.right, list);
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