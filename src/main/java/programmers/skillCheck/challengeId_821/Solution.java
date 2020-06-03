package programmers.skillCheck.challengeId_821;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                ch += n;
                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
            } else if ('A' <= ch && ch <= 'Z') {
                ch += n;
                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
            }
            answer.setCharAt(i, ch);

        }
        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution("A z B d z k", 4);
        System.out.println(answer);
    }
}
