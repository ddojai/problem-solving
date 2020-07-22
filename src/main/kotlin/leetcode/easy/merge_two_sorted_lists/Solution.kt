package leetcode.easy.merge_two_sorted_lists

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var first: ListNode? = null
        var curr: ListNode? = null
        var list1 = l1
        var list2 = l2

        while (list1 != null && list2 != null) {
            var list: ListNode?
            if (list1.`val` > list2.`val`) {
                list = list2
                list2 = list2.next
            } else {
                list = list1
                list1 = list1.next
            }
            if (first == null) {
                first = list
                curr = list
            } else {
                curr?.next = list
                curr = curr?.next
            }
        }

        while (list1 != null) {
            curr?.next = list1
            curr = curr?.next

        }
        while (list2 != null) {
            curr?.next = list2
            curr = curr?.next
        }

        return first
    }
}
