package baekjoon.lecture.beginner.datastructure1.queue.p1158;

import java.io.*;
import java.util.LinkedList;

/**
 * https://www.acmicpc.net/problem/1158
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputList = br.readLine().split(" ");
            int n = Integer.parseInt(inputList[0]);
            int m = Integer.parseInt(inputList[1]);

            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }

            bw.write("<");

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    queue.offerLast(queue.pollFirst());
                }

                bw.write(queue.pollFirst() + ", ");
            }
            bw.write(queue.pollFirst() + ">");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}