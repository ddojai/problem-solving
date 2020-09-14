package leetcode.easy.remove_outermost_parentheses;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses
 * 1021. Remove Outermost Parentheses
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder removeOuter = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                removeOuter.append('(');
                sum++;
            } else {
                removeOuter.append(')');
                sum--;
            }
            if (sum == 0) {
                sb.append(removeOuter.substring(1, removeOuter.length() - 1));
                removeOuter.setLength(0);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.removeOuterParentheses("(()())(())");

        System.out.println(result);
    }
}
