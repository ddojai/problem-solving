package leetcode.easy.reverse_linked_list;

/**
 * 206. Reverse Linked List
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public ListNode reverse(ListNode node, ListNode prev) {
        if (node == null) {
            return null;
        }
        ListNode next = node.next;
        node.next = prev;

        if (next == null) {
            return node;
        }

        return reverse(next, node);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}