package leetcode.easy.unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> valueSet = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            valueSet.add(entry.getValue());
        }

        return map.keySet().size() == valueSet.size();
    }
}
