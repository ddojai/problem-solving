package leetcode.easy.compare_strings_by_frequency_of_the_smallest_character;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
 */
public class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int cnt = 0;
            int queryCnt = f(queries[i]);

            for (String word : words) {
                int wordCnt = f(word);
                if (queryCnt < wordCnt) {
                    cnt++;
                }
            }

            result[i] = cnt;
        }

        return result;
    }

    private static int f(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char min = 'z';
        for (Character c : str.toCharArray()) {
            map.merge(c, 1, Integer::sum);
            if (c < min) {
                min = c;
            }
        }

        return map.get(min);
    }
}
