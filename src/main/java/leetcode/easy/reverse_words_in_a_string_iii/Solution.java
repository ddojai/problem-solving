package leetcode.easy.reverse_words_in_a_string_iii;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
