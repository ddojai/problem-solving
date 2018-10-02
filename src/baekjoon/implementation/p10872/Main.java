package baekjoon.implementation.p10872;

import java.io.*;

/**
 * 팩토리얼
 * https://www.acmicpc.net/problem/10872
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }

            bw.write(sum + "");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}