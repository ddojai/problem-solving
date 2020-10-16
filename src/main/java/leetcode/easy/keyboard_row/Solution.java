package leetcode.easy.keyboard_row;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/keyboard-row/
 */
public class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('q', 1);
            put('w', 1);
            put('e', 1);
            put('r', 1);
            put('t', 1);
            put('y', 1);
            put('u', 1);
            put('i', 1);
            put('o', 1);
            put('p', 1);
            put('a', 2);
            put('s', 2);
            put('d', 2);
            put('f', 2);
            put('g', 2);
            put('h', 2);
            put('j', 2);
            put('k', 2);
            put('l', 2);
            put('z', 3);
            put('x', 3);
            put('c', 3);
            put('v', 3);
            put('b', 3);
            put('n', 3);
            put('m', 3);
        }};

        List<String> list = new ArrayList<>();
        for (String word : words) {
            int row = map.get(Character.toLowerCase(word.charAt(0)));
            boolean isOneRow = true;
            for (int i = 1; i < word.length(); i++) {
                if (row != map.get(Character.toLowerCase(word.charAt(i)))) {
                    isOneRow = false;
                    break;
                }
            }
            if (isOneRow) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}
