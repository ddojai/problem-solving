package baekjoon.queue.p10845;

import java.io.*;
import java.util.*;

/**
 * 10845번 큐
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 여섯 가지이다.
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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

            LinkedList<Integer> queue = new LinkedList<>();

            for (String input : inputList) {
                String[] split = input.split(" ");
                switch (split[0]) {
                    case "push":
                        queue.offer(Integer.parseInt(split[1]));
                        break;
                    case "pop":
                        Integer pop = queue.poll();
                        if (pop == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(pop + "\n");
                        }
                        break;
                    case "size":
                        bw.write(queue.size() + "\n");
                        break;
                    case "empty":
                        if (queue.isEmpty()) {
                            bw.write("1\n");
                        } else {
                            bw.write("0\n");
                        }
                        break;
                    case "front":
                        Integer first = queue.peekFirst();
                        if (first == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(first + "\n");
                        }
                        break;
                    case "back":
                        Integer last = queue.peekLast();
                        if (last == null) {
                            bw.write("-1\n");
                        } else {
                            bw.write(last + "\n");
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