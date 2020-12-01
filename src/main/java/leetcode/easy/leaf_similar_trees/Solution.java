package leetcode.easy.leaf_similar_trees;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1  = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        recursive(root1, list1);
        recursive(root2, list2);

        return list1.equals(list2);
    }

    private static void recursive(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        if (node.left != null) {
            recursive(node.left, list);
        }
        if (node.right != null) {
            recursive(node.right, list);
        }
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