package leetcode.easy.generate_a_string_with_characters_that_have_odd_counts;

/**
 * https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts
 */
public class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        }

        return sb.toString();
    }
}
