package baekjoon.p2749;

import java.io.*;

/**
 * 2749번 피보나치 수 3
 * https://www.acmicpc.net/problem/2749
 */
class Main {

    private static final int MOD = 1000000;
    private static final int P = MOD / 10 * 15;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            long n = Long.parseLong(br.readLine());

            int[] fibo = new int[P];
            fibo[0] = 0;
            fibo[1] = 1;

            // N번째 피보나치 수를 M으로 나눈 나머지는 N%P번째 피보나치 수를 M을 나눈 나머지와 같습니다.
            // https://www.acmicpc.net/blog/view/28
            for (int i = 2; i < P; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
                fibo[i] %= MOD;
            }


            int result = fibo[(int) (n % P)];
            bw.write(String.valueOf(result));

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}