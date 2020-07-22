package leetcode.easy.tree.binaryTreeLevelOrderTraversal2;

import leetcode.easy.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    addTree(list, root, 0);
    Collections.reverse(list);

    return list;
  }

  public void addTree(List<List<Integer>> list, TreeNode tree, int level) {
    if (tree == null) {
      return;
    }

    if (level > (list.size() - 1)) {
      List<Integer> levelList = new ArrayList<>();
      levelList.add(tree.val);
      list.add(levelList);
    } else {
      List<Integer> levelList = list.get(level);
      levelList.add(tree.val);
      list.set(level, levelList);
    }

    addTree(list, tree.left, level + 1);
    addTree(list, tree.right, level + 1);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    TreeNode node1 = new TreeNode(9);
    TreeNode node2 = new TreeNode(20);
    TreeNode node3 = new TreeNode(15);
    TreeNode node4 = new TreeNode(7);
    root.left = node1; root.right = node2;
    node2.left = node3; node2.right = node4;

    Solution solution = new Solution();
    List<List<Integer>> list = solution.levelOrderBottom(root);
    System.out.println(list);
  }
}
