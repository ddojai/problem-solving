package codility.StacksAndQueues.Nesting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int n = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                n++;
            } else if (c == ')') {
                n--;
            }
            if (n < 0) {
                break;
            }
        }

        return (n == 0) ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {

        Solution solution = new Solution();
        int result = solution.solution("(()(())())");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
