package leetcode.easy.two_sum

import kotlin.test.assertTrue

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        lateinit var arr: IntArray
        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size)
                if (nums[i] + nums[j] == target) {
                    arr = intArrayOf(i, j)
                }
        }
        return arr
    }
}

fun main(args: Array<String>) {
    val sol = Solution()
    val result = sol.twoSum(intArrayOf(2, 7, 11, 15), 9)
    assertTrue(intArrayOf(0, 1).contentEquals(result))
}
