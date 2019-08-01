package leetcode.problems.two_numbers

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        lateinit var arr: IntArray
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if ((nums[i] + nums[j]) == target) {
                    arr = intArrayOf(i, j)
                }
            }
        }
        return arr
    }
}
