package baekjoon.lecture.beginner.math1.factorial.p10872;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum + "");
        bw.close();
    }
}