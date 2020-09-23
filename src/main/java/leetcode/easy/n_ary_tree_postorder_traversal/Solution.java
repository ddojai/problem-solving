package leetcode.easy.n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        post(root, list);

        return list;
    }

    public void post(Node current, List<Integer> list) {
        if (current != null) {
            for (Node child : current.children) {
                post(child, list);
            }
            list.add(current.val);
        }
    }
}

// Definition for a Node.
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