package baekjoon.lecture.beginner.datastructure1.stack.p10799;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        int result = 0;

        Deque<Integer> stk = new ArrayDeque<>();
        for (int idx = 0; idx < input.length(); idx++) {
            char c = input.charAt(idx);
            if (c == '(') {
                stk.offerFirst(idx);
            } else {
                // 닫는 기호일 때
                Integer top = stk.pollFirst();
                if (top == null) {
                  throw new NullPointerException("not exist top");
                } else if (top + 1 == idx) {
                    result += stk.size();
                } else {
                    result += 1;
                }
            }
        }

        stk.clear();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}