package leetcode.easy.average_of_levels_in_binary_tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Map<Integer, List<Double>> map = new HashMap<>();
        recursive(root, map, 0);
        for (int key : map.keySet()) {
            List<Double> temp = map.get(key);
            double sum = 0;
            for (Double num : temp) {
                sum += num;
            }
            list.add(sum / temp.size());
        }

        return list;
    }

    private void recursive(TreeNode node, Map<Integer, List<Double>> map, int level) {
        if (node == null) {
            return;
        }
        if (map.size() > level) {
            List<Double> list = map.get(level);
            list.add((double) node.val);
            map.put(level, list);
        } else {
            List<Double> list = new ArrayList<>();
            list.add((double) node.val);
            map.put(level, list);
        }

        recursive(node.left, map, level + 1);
        recursive(node.right, map, level + 1);
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