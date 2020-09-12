package leetcode.easy.convert_binary_number_in_a_linked_list_to_integer;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append(head.val);
        ListNode curr = head.next;
        while (curr != null) {
            sb.append(curr.val);
            curr = curr.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}