package leetcode.easy.minimum_subsequence_in_non_increasing_order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
 */
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArr, Collections.reverseOrder());

        int sum = 0;
        for (int num : numsArr) {
            sum += num;
        }

        List<Integer> ret = new ArrayList<>();
        int sumOfSub = 0;
        for (int i = 0; i < numsArr.length; i++) {
            ret.add(numsArr[i]);
            sumOfSub += numsArr[i];
            int remain = sum - sumOfSub;
            if (sumOfSub > remain) {
                break;
            }
        }

        return ret;
    }
}
