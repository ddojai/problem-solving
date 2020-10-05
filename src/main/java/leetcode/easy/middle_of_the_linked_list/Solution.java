package leetcode.easy.middle_of_the_linked_list;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        while (head.next != null) {
            head = head.next;
            list.add(head);
        }

        return list.get(list.size() / 2);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}