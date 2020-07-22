package leetcode.easy.add_two_numbers

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyHead = ListNode(0);
        var p = l1; var q = l2; var curr = dummyHead
        var carry = 0;

        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = carry + x + y
            carry = sum / 10;
            curr.next = ListNode(sum % 10);
            curr = curr.next!!
            if (p != null) p = p.next
            if (q != null) q = q.next
        }
        if (carry > 0) {
            curr.next = ListNode(carry);
        }

        return dummyHead.next
    }
}

// Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main(args: Array<String>) {
    val solution = Solution()
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next!!.next = ListNode(3)

    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next!!.next = ListNode(4)

    var result = solution.addTwoNumbers(l1, l2)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

/* my solution
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val sb1 = StringBuilder()
        val sb2 = StringBuilder()

        var list1 = l1
        while (list1 != null) {
            sb1.insert(0, list1.`val`.toString())
            list1 = list1.next
        }

        var list2 = l2
        while (list2 != null) {
            sb2.insert(0, list2.`val`.toString())
            list2 = list2.next
        }

        val num1 = sb1.toString().toLong()
        val num2 = sb2.toString().toLong()
        val sum =  num1 + num2
        val sbSum = StringBuilder(sum.toString()).reverse()
        val head = ListNode(sbSum[0].toString().toInt())
        var curr : ListNode? = head
        for (i in 1 until sbSum.length) {
            curr!!.next = ListNode(sbSum[i].toString().toInt())
            curr = curr.next
        }
        return head
    }
 */
