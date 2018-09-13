package baekjoon.p6591;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 이항 쇼다운
 * https://www.acmicpc.net/problem/6591
 *
 * 참고
 * http://sexycoder.tistory.com/72
 */
class Main {
    private static int[][] memo;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            List<String> inputList = new ArrayList<>();
            do {
                String input = br.readLine();
                if (input.equals("0 0")) {
                    break;
                }
                inputList.add(input);
            } while (true);

            memo = new int[3000][3000];

            for (String input : inputList) {
                String[] split = input.split(" ");
                int n = Integer.parseInt(split[0]);
                int k = Integer.parseInt(split[1]);

                long result;
                if (k >= n / 2) {
                    k = n - k;
                }
                /*
                 * 1) n과 m이 같은 경우 혹은 m이 0인 경우 : 답은 1이다.
                 * 2) m이 1인 경우 : 답은 n이다.
                 * 3) m이 2인 경우 : 답은 n(n-1)/2이다.
                 * 4) m이 3부터 : 메모이제이션과 재귀를 이용해서 구한다.
                 */
                if (n == k || k == 0) {
                    result = 1;
                } else if (k == 1) {
                    result = n;
                } else if (k == 2) {
                    result = ((long)n * (n - 1)) / 2;
                } else {
                    result = combination(n, k);
                }
                bw.write(result + "\n");
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int combination(int n, int k) {
        if (memo[n][k] != 0) {
            return memo[n][k];
        } else if (n == k || k == 0) {
            return memo[n][k] = 1;
        } else if (k == 1) {
            return memo[n][k] = n;
        } else {
            return memo[n][k] = combination(n - 1, k - 1) + combination(n - 1, k);
        }
    }
}