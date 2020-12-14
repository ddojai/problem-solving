package leetcode.easy.shortest_completing_word;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/shortest-completing-word/
 */
public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                map.merge(c, 1, Integer::sum);
            }
        }

        String result = null;
        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (char c : word.toCharArray()) {
                temp.merge(c, 1, Integer::sum);
            }
            boolean isContainsAll = true;
            for (char key : map.keySet()) {
                if (temp.get(key) == null || temp.get(key) < map.get(key)) {
                    isContainsAll = false;
                    break;
                }
            }
            if (isContainsAll) {
                if (result == null || result.length() > word.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}
