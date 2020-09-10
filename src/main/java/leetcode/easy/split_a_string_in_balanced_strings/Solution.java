package leetcode.easy.split_a_string_in_balanced_strings;

public class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}
