package baekjoon.p1003;

import java.io.*;

/**
 * 1003번 피보나치 함수
 * https://www.acmicpc.net/problem/1003
 */
class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int cnt = Integer.parseInt(br.readLine());

            for (int i = 0; i < cnt; i++) {
                int n = Integer.parseInt(br.readLine());

                // n 이 0 일때를 대비해서 + 2
                int[] zero = new int[n + 2];
                zero[0] = 1; zero[1] = 0;
                int[] one = new int[n + 2];
                one[0] = 0; one[1] = 1;

                for (int j = 2; j <= n; j++) {
                    zero[j] = zero[j-1] + zero[j-2];
                    one[j] = one[j-1] + one[j-2];
                }

                bw.write(zero[n] + " " + one[n] + "\n");
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}