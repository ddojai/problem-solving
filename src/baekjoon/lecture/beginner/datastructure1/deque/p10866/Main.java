package baekjoon.lecture.beginner.datastructure1.deque.p10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/10866
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            String input = br.readLine();
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
    }
}