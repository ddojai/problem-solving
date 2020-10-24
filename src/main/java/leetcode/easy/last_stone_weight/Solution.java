package leetcode.easy.last_stone_weight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */
public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().sorted().collect(Collectors.toList());
        while (list.size() > 1) {
            int temp = list.get(list.size() - 1) - list.get(list.size() - 2);
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            if (temp > 0) {
                list.add(temp);
            }
            Collections.sort(list);
        }

        if (list.size() == 0) {
            return 0;
        }
        return list.get(0);
    }
}
