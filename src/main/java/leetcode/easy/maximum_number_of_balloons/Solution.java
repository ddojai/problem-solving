package leetcode.easy.maximum_number_of_balloons;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-number-of-balloons/
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        if (map.get('b') == null || map.get('a') == null ||
            map.get('l') == null || map.get('o') == null || map.get('n') == null) {
            return 0;
        }
        int min = map.get('b');
        min = Math.min(min, map.get('a'));
        min = Math.min(min, map.get('l') / 2);
        min = Math.min(min, map.get('o') / 2);
        min = Math.min(min, map.get('n'));

        return min;
    }
}
