package baekjoon.etc.p11050;

import java.io.*;

/**
 * 이항 계수 1
 * https://www.acmicpc.net/problem/11050
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            int result = combination(n, k);

            bw.write(result + "");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int combination(int n, int k)
    {
        if (k == 0 || n == k) {
            return 1;
        }

        return combination(n-1, k - 1) + combination(n-1, k);
    }
}