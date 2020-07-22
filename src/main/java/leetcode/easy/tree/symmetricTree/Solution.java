package leetcode.easy.tree.symmetricTree;

import leetcode.easy.tree.TreeNode;

/**
 * source: https://beccacatcheserrors.tistory.com/21
 */
public class Solution {
  public boolean isSymmetric(TreeNode root) {
    return isMirror(root, root);
  }

  public boolean isMirror(TreeNode t1, TreeNode t2) {
    //t1과 t2가 둘다 null이면 true
    if (t1 == null && t2 == null) return true;

    //t1,t2중에 하나만 널이면 양쪽이 같지 않으므로 false
    if (t1 == null || t2 == null) return false;

    //t1과 t2의 값이 달라도 false
    if (t1.val != t2.val) return false;

    return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
  }
}
