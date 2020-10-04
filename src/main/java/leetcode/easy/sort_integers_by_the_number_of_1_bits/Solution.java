package leetcode.easy.sort_integers_by_the_number_of_1_bits;

import java.util.*;

/**
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int num : arr) {
            String str = Integer.toBinaryString(num);
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    cnt++;
                }
            }

            List<Integer> list = map.get(cnt);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(num);
            map.put(cnt, list);
        }

        List<Integer> merged = new ArrayList<>();
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            Collections.sort(list);
            merged.addAll(list);
        }

        return merged.stream().mapToInt(i -> i).toArray();

    }
}
