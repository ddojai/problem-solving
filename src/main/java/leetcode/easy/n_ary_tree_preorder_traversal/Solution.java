package leetcode.easy.n_ary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);

        return list;
    }

    public void preorder(Node current, List<Integer> list) {
        if (current != null) {
            list.add(current.val);
            for (Node child : current.children) {
                preorder(child, list);
            }
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};