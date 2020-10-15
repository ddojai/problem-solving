package leetcode.easy.check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;

/**
 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 */
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                index = i + 1;
                break;
            }
        }

        return index;
    }
}
