package baekjoon.lecture.beginner.datastructure1.stack.p9012;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        Deque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            boolean isVPS = true;
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (c == '(') {
                    stk.offerFirst(c);
                } else {
                    // 닫는 기호일 때
                    if (stk.pollFirst() == null) {
                        // 남은 여는 기호가 없으면
                        isVPS = false;
                        break;
                    }
                }
            }
            // 여는 기호가 남았으면
            if (!stk.isEmpty()) {
                isVPS = false;
            }
            if (isVPS) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
            stk.clear();
        }

        br.close();
        bw.close();
    }
}