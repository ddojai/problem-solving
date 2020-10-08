package leetcode.easy.find_common_characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < A[0].length(); i++) {
            char key = A[0].charAt(i);
            map.merge(key, 1, Integer::sum);
        }

        for (int i = 1; i < A.length; i++) {
            String str = A[i];
            Map<Character, Integer> compareMap = new HashMap<>();
            for (int j = 0; j < A[i].length(); j++) {
                char key = str.charAt(j);
                compareMap.merge(key, 1, Integer::sum);
            }
            for (Character key : map.keySet()) {
                if (compareMap.get(key) != null) {
                    if (map.get(key) > compareMap.get(key)) {
                        map.put(key, compareMap.get(key));
                    }
                } else {
                    map.put(key, 0);
                }
            }
        }

        List<String> list = new ArrayList<>();
        for (char key : map.keySet()) {
            int cnt = map.get(key);
            for (int i = 0; i < cnt; i++) {
                list.add(String.valueOf(key));
            }
        }

        return list;
    }
}
