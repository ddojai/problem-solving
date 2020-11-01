package leetcode.easy.thousand_separator;

/**
 * https://leetcode.com/problems/thousand-separator/
 */
public class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String remain = String.valueOf(n);
        do {
            int len = remain.length() - 3;
            if (len > 0) {
                sb.insert(0, remain.substring(len));
                sb.insert(0, ".");
                remain = remain.substring(0, remain.length() - 3);
            } else {
                sb.insert(0, remain);
                remain = null;
            }
        } while (remain != null);

        return sb.toString();
    }
}
