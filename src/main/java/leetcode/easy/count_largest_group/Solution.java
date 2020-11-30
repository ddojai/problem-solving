package leetcode.easy.count_largest_group;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/count-largest-group/
 */
public class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            int sum = 0;
            for (char c : num.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            Set<Integer> set = map.get(sum);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(i);
            map.put(sum, set);
        }

        int largestCnt = 0;
        int maxSize = 1;
        for (int key : map.keySet()) {
            int size = map.get(key).size();
            if (maxSize < size) {
                maxSize = size;
                largestCnt = 1;
            } else if (maxSize == size) {
                largestCnt++;
            }
        }

        return largestCnt;
    }
}
