package leetcode.easy.n_repeated_element_in_size_2n_array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array
 */
public class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer key : map.keySet()) {
            int cnt = map.get(key);
            if (cnt == A.length / 2) {
                return key;
            }
        }

        return 0;
    }
}
