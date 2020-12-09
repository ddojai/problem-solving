package leetcode.easy.valid_anagram;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
