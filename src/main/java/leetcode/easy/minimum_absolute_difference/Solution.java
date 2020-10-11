package leetcode.easy.minimum_absolute_difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-absolute-difference/
 */
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < min) {
                answer.clear();
                min = diff;
            } else if (diff > min) {
                continue;
            }
            List<Integer> element = new ArrayList<>();
            element.add(arr[i]);
            element.add(arr[i + 1]);
            answer.add(element);
        }

        return answer;
    }
}
