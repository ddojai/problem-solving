package baekjoon.queue.p10845;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/10845
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = Integer.parseInt(br.readLine());

            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                String input = br.readLine();
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