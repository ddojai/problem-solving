package leetcode.problems.palindrome_number

import kotlin.test.assertFalse

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val xStr = x.toString();
        val len = xStr.length;
        for (i in 0..(len / 2)) {
            if (xStr[i] != xStr[len - 1 - i])
                return false
        }

        return true
    }
}

fun main(args: Array<String>) {
    val sol = Solution()
    val result = sol.isPalindrome(-121)
    assertFalse(result)
}
