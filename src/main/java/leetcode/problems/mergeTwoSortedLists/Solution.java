package leetcode.problems.mergeTwoSortedLists;

class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first;
        ListNode curr;
        if (l1.val > l2.val) {
            first = l2;
            curr = l2;
            l2 = l2.next;
        } else {
            first = l1;
            curr = l1;
            l1 = l1.next;
        }

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l2;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }
        else {
            curr.next = l2;
        }

        return first;
    }
}
