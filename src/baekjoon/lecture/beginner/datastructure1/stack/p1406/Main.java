package baekjoon.lecture.beginner.datastructure1.stack.p1406;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int cmdCnt = Integer.parseInt(br.readLine());

        Deque<Character> stkPrev = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            stkPrev.offerFirst(c);
        }

        Deque<Character> stkNext = new ArrayDeque<>();
        for (int i = 0; i < cmdCnt; i++) {
            String[] split = br.readLine().split(" ");
            String cmd = split[0];
            switch (cmd) {
                case "L":
                    if (!stkPrev.isEmpty()) {
                        stkNext.offerFirst(stkPrev.pollFirst());
                    }
                    break;
                case "D":
                    if (!stkNext.isEmpty()) {
                        stkPrev.offerFirst(stkNext.pollFirst());
                    }
                    break;
                case "B":
                    if (!stkPrev.isEmpty()) {
                        stkPrev.pollFirst();
                    }
                    break;
                case "P":
                    char c = split[1].charAt(0);
                    stkPrev.offerFirst(c);
                    break;
            }
        }
        br.close();

        while (!stkPrev.isEmpty()) {
            stkNext.offerFirst(stkPrev.pollFirst());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (!stkNext.isEmpty()) {
            bw.write(stkNext.pollFirst());
        }

        bw.flush();
        bw.close();

        stkPrev.clear();
        stkNext.clear();
    }
}