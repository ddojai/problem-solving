package baekjoon.p2407;

import java.io.*;
import java.math.BigInteger;

/**
 * 조합
 * https://www.acmicpc.net/problem/2407
 *
 * 참고
 * http://nackwon.tistory.com/60
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            BigInteger[][] list = new BigInteger[n + 1][n + 1];

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) {
                        list[i][j] = BigInteger.valueOf(1);
                    }
                    else {
                        list[i][j] = list[i-1][j-1].add(list[i-1][j]);
                    }
                }
            }

            bw.write(list[n][k] + "");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}