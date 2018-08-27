package baekjoon.p10828;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 10828번 스택
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 다섯 가지이다.
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
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

            Deque<Integer> stk = new ArrayDeque<>();

            for (String input : inputList) {
                String[] split = input.split(" ");
                switch (split[0]) {
                    case "push":
                        stk.offerFirst(Integer.parseInt(split[1]));
                        break;
                    case "pop":
                        if (stk.peekFirst() == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(stk.pollFirst() + "\n");
                        }
                        break;
                    case "size":
                        bw.write(stk.size() + "\n");
                        break;
                    case "empty":
                        if (stk.isEmpty()) {
                            bw.write("1\n");
                        } else {
                            bw.write("0\n");
                        }
                        break;
                    case "top":
                        if (stk.peekFirst() == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(stk.peekFirst() + "\n");
                        }
                        break;
                    default:
                        throw new IOException("invalid input");
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}