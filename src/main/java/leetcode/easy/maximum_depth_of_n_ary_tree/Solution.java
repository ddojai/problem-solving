package leetcode.easy.maximum_depth_of_n_ary_tree;

import java.util.List;

/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }

        return max + 1;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};