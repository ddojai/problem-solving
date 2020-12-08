package leetcode.easy.rank_transform_of_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array/
 */
public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: sortedArr) {
            if (map.get(num) == null) {
                map.put(num, rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }
}
