package leetcode.problems.validParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            char pop = 0;
            switch (bracket) {
                case '(':
                case '{':
                case '[':
                    st.push(bracket);
                    break;
                case ')':
                case '}':
                case ']':
                    if (st.size() == 0) {
                        return false;
                    }
                    pop = st.pop();
                    break;
            }
            if (pop != 0) {
                if (bracket == ')') {
                    if (pop != '(') {
                        return false;
                    }
                } else if (bracket == '}') {
                    if (pop != '{') {
                        return false;
                    }
                } else {
                    if (pop != '[') {
                        return false;
                    }
                }
            }
        }
        return st.size() == 0;
    }


}
