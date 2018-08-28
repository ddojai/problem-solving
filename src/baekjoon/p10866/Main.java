package baekjoon.p10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 10866번 (10m)
 * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 여덟 가지이다.
 *
 * push_front X: 정수 X를 덱의 앞에 넣는다.
 * push_back X: 정수 X를 덱의 뒤에 넣는다.
 * pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 덱에 들어있는 정수의 개수를 출력한다.
 * empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
 * front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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

            Deque<Integer> deque = new ArrayDeque<>();

            for (String input : inputList) {
                String[] split = input.split(" ");
                switch (split[0]) {
                    case "push_front":
                        deque.offerFirst(Integer.parseInt(split[1]));
                        break;
                    case "push_back":
                        deque.offerLast(Integer.parseInt(split[1]));
                        break;
                    case "pop_front":
                        Integer pop_front = deque.pollFirst();
                        if (pop_front == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(pop_front + "\n");
                        }
                        break;
                    case "pop_back":
                        Integer pop_back = deque.pollLast();
                        if (pop_back == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(pop_back + "\n");
                        }
                        break;
                    case "size":
                        bw.write(deque.size() + "\n");
                        break;
                    case "empty":
                        if (deque.isEmpty()) {
                            bw.write("1\n");
                        } else {
                            bw.write("0\n");
                        }
                        break;
                    case "front":
                        Integer front = deque.peekFirst();
                        if (front == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(front + "\n");
                        }
                        break;
                    case "back":
                        Integer back = deque.peekLast();
                        if (back == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(back + "\n");
                        }
                        break;
                    default:
                        throw new IOException("invalid input : " + split[0]);
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}