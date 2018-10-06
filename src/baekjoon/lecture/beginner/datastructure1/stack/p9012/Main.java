package baekjoon.lecture.beginner.datastructure1.stack.p9012;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = Integer.parseInt(br.readLine());
            List<String> inputList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                inputList.add(br.readLine());
            }

            Deque<Character> stk = new ArrayDeque<>();
            for (String input : inputList) {
                boolean isVPS = true;
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}