package leetcode.easy.find_the_difference;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapT.merge(c, 1, Integer::sum);
        }
        Map<Character, Integer> mapS = new HashMap<>();
        for (char c : s.toCharArray()) {
            mapS.merge(c, 1, Integer::sum);
        }

        char result = 0;
        for (char key : mapT.keySet()) {
            if (mapS.get(key) == null || mapS.get(key) < mapT.get(key)) {
                result = key;
                break;
            }
        }

        return result;
    }
}
