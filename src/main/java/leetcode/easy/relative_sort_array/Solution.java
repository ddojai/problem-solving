package leetcode.easy.relative_sort_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/relative-sort-array
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> idxMap = new TreeMap<>();
        for (int i = 0; i < arr2.length; i++) {
            idxMap.put(i, arr2[i]);
        }
        Map<Integer, Integer> arrMap = new TreeMap<>();
        for (int key : arr1) {
            arrMap.merge(key, 1, Integer::sum);
        }

        List<Integer> list = new ArrayList<>();
        for (int idx : idxMap.keySet()) {
            int num = idxMap.get(idx);
            int cnt = arrMap.get(num);
            for (int i = 0; i < cnt; i++) {
                list.add(num);
            }
            arrMap.remove(num);
        }
        for (int num : arrMap.keySet()) {
            int cnt = arrMap.get(num);
            for (int i = 0; i < cnt; i++) {
                list.add(num);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
