package leetcode.easy.largest_substring_between_two_equal_characters;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 */
public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Pair<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            Pair<Integer, Integer> pair = map.get(key);
            if (pair == null) {
                pair = new Pair<>(i, -1);
            } else {
                pair.second = i;
            }
            map.put(key, pair);
        }

        int max = -1;
        for (Character key : map.keySet()) {
            Pair<Integer, Integer> pair = map.get(key);
            if (pair.second > 0) {
                int len = pair.second - pair.first - 1;
                if (len > max) {
                    max = len;
                }
            }
        }

        return max;
    }
}

class Pair<T, S> {
    public T first;
    public S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
}

