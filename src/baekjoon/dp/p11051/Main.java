package baekjoon.dp.p11051;

import java.io.*;

/**
 * 이항 계수 2
 * https://www.acmicpc.net/problem/11051
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            long[][] memo = new long[n + 1][k + 1];
            long result = combination(n, k, memo);

            bw.write((result) + "");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long combination(int n, int k, long[][] memo)
    {
        if (k == 0 || n == k) {
            return 1;
        }
        if (memo[n][k] == 0) {
            memo[n][k] = (combination(n-1, k - 1, memo) + combination(n-1, k, memo)) % 10007;
        }

        return memo[n][k];
    }
}