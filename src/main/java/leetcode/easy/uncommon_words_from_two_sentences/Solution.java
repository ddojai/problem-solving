package leetcode.easy.uncommon_words_from_two_sentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        String[] wordsFromA = A.split(" ");
        String[] wordsFromB = B.split(" ");
        for (String word : wordsFromA) {
            map.merge(word, 1, Integer::sum);
        }
        for (String word : wordsFromB) {
            map.merge(word, 1, Integer::sum);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[0]);
    }
}
