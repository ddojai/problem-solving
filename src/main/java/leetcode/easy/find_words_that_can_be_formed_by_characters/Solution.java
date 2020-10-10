package leetcode.easy.find_words_that_can_be_formed_by_characters;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            map.merge(chars.charAt(i), 1, Integer::sum);
        }

        int cnt = 0;
        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                temp.merge(word.charAt(i), 1, Integer::sum);
            }
            boolean isGood = true;
            for (Character key : temp.keySet()) {
                if (map.get(key) == null || map.get(key) < temp.get(key)) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) {
                cnt += word.length();
            }
        }

        return cnt;
    }
}
