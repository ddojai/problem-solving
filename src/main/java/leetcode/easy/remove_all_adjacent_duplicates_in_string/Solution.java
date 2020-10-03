package leetcode.easy.remove_all_adjacent_duplicates_in_string;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class Solution {
    public String removeDuplicates(String S) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            Character ch = S.charAt(i);
            if (stack.peekFirst() == ch) {
                stack.removeFirst();
            } else {
                stack.addFirst(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (stack.peekFirst() != null) {
            sb.insert(0, stack.removeFirst());
        }

        return sb.toString();
    }
}
