package leetcode.easy.goat_latin;

/**
 * https://leetcode.com/problems/goat-latin/
 */
public class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        String prefix = "";
        for (String word : words) {
            sb.append(prefix);
            prefix = " ";
            if (isVowel(word)) {
                sb.append(word).append("ma");
            } else {
                sb.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            for (int i = 0; i < cnt; i++) {
                sb.append("a");
            }
            cnt++;
        }

        return sb.toString();
    }

    private boolean isVowel(String word) {
        char c = word.toLowerCase().charAt(0);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
